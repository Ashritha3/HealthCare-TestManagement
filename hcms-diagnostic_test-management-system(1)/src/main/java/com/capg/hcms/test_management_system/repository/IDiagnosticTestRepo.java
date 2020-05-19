package com.capg.hcms.test_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.hcms.test_management_system.model.DiagnosticTest;

/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     4/5/2020
-Description              :     DiagnosticTestServiceImpl class implements services for Testmanagement System
*******************************************************************************************************************************/

public interface IDiagnosticTestRepo extends JpaRepository<DiagnosticTest, String>{
	
	public DiagnosticTest getByTestName(String testName);

}
