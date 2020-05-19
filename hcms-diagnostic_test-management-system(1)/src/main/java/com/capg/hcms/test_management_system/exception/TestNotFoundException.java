package com.capg.hcms.test_management_system.exception;


/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     4/5/2020
-Description              :     DiagnosticTestServiceImpl class implements services for Testmanagement System
*******************************************************************************************************************************/


public class TestNotFoundException extends RuntimeException{
	
	public TestNotFoundException(String message) {
		super(message);
	}

}
