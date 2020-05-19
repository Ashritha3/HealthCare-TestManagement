package com.capg.hcms.test_management_system.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     4/5/2020
-Description              :     DiagnosticTest Bean class
*******************************************************************************************************************************/


@Entity
@Table(name = "test_info")
public class DiagnosticTest {
	@Id
    private String testId;
	private String testName;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	
	public DiagnosticTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public DiagnosticTest(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}

	@Override
	public String toString() {
		return "DiagnosticTest [testId=" + testId + ", testName=" + testName + "]";
	}

    

}
