package com.capg.hcms.test_management_system.model;

import java.time.LocalDateTime;


public class Appointment {
	private User user;
	private long appointmentId;
	private DiagnosticTest test;
	private LocalDateTime dateTime;
	private boolean approved=false;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public DiagnosticTest getTest() {
		return test;
	}
	public void setTest(DiagnosticTest test) {
		this.test = test;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(User user, long appointmentId, DiagnosticTest test, LocalDateTime dateTime, boolean approved) {
		super();
		this.user = user;
		this.appointmentId = appointmentId;
		this.test = test;
		this.dateTime = dateTime;
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "Appointment [user=" + user + ", appointmentId=" + appointmentId + ", test=" + test + ", dateTime="
				+ dateTime + ", approved=" + approved + "]";
	}
	
	

}
