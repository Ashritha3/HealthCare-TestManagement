package com.capg.hcms.test_management_system.model;

import java.util.List;

public class DiagnosticCenter {
    private String centerName;
	private String centerId;
	private List<DiagnosticTest> listOfTests;
	
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public List<DiagnosticTest> getListOfTests() {
		return listOfTests;
	}
	public void setListOfTests(List<DiagnosticTest> listOfTests) {
		this.listOfTests = listOfTests;
	}
	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DiagnosticCenter(String centerName, String centerId, List<DiagnosticTest> listOfTests,
			List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		this.listOfTests = listOfTests;
		
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [centerName=" + centerName + ", centerId=" + centerId + ", listOfTests=" + listOfTests
				+ "]";
	}
	
	

}
