package com.capg.hcms.test_management_system.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcms.test_management_system.model.DiagnosticTest;
import com.capg.hcms.test_management_system.service.DiagnosticTestServiceImpl;


/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     4/5/2020
-Description              :     DiagnosticTestController Class for accessing DiagnosticTest Management System services
*******************************************************************************************************************************/


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/diagnostictest")
public class DiagnosticTestController {
	
	@Autowired
	DiagnosticTestServiceImpl service;
	
	@GetMapping("/getalltest")
	public ResponseEntity<List<DiagnosticTest>> alltests(){
		return new ResponseEntity<List<DiagnosticTest>>(service.getAllTests(), HttpStatus.OK);
	}
	@GetMapping("/gettest/testid/{testId}")
	public DiagnosticTest getTest(@PathVariable String testId){
		return service.getTestById(testId);
	}
	@PostMapping("/addtest")
	public ResponseEntity<DiagnosticTest> addtest(@RequestBody DiagnosticTest test) {
		return new ResponseEntity<DiagnosticTest>(service.addTest(test), HttpStatus.CREATED);
	}
	@DeleteMapping("/removetest/{testId}")
	public String removeTest(@PathVariable String testId) {
		DiagnosticTest test=getTest(testId);
		if(service.removeTest(test))
		  return "Test is removed";
		else
			return "Test is not removed";
	}
}
