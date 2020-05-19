package com.capg.hcms.test_management_system.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcms.test_management_system.exception.ListEmptyException;
import com.capg.hcms.test_management_system.exception.TestAlreadyExistException;
import com.capg.hcms.test_management_system.exception.TestNotFoundException;
import com.capg.hcms.test_management_system.model.DiagnosticTest;
import com.capg.hcms.test_management_system.repository.IDiagnosticTestRepo;

/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     4/5/2020
-Description              :     DiagnosticTestServiceImpl Class implements services for DiagnosticTest Management System
*******************************************************************************************************************************/


@Service
public class DiagnosticTestServiceImpl implements IDiagnosticTestService{
	
    @Autowired
    IDiagnosticTestRepo testRepo;
    
    @Autowired
    Random random;
	
	@Override
	public DiagnosticTest addTest(DiagnosticTest test) {
       test.setTestId(Integer.toString(random.nextInt(10000000)).substring(0,5));
    	
    	if(testRepo.existsById(test.getTestId())) {
			throw new TestAlreadyExistException("["+test.getTestId()+"] already exists");
		}
 
		return testRepo.save(test);
	}

	@Override
     public boolean removeTest(DiagnosticTest test) {
		
		if(!testRepo.existsById(test.getTestId())) {
			throw new TestNotFoundException("["+test.getTestId()+"] is Not Found"); 
		}
		
		testRepo.deleteById(test.getTestId());
	    
	    return !testRepo.existsById(test.getTestId());
	}
	
	@Override
	public DiagnosticTest getTestById(String testId) {
		
		if(!testRepo.existsById(testId)) {
			throw new TestNotFoundException("["+testId+"] is Not Found"); 
		}
		
		return testRepo.getOne(testId);
	
	}
	
	@Override
	public List<DiagnosticTest> getAllTests(){
		if(testRepo.findAll().isEmpty()) {
			throw new ListEmptyException("List is empty");
		}
		return testRepo.findAll();
	}

}
