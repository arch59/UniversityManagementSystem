package com.cg.ums.bean;


import java.sql.Date;


public class Student {
private int applicationId;
private String fullName;
private Date dob;
private String highestQual;
private int marksObt;
private String goals;
private String emailId;
private String sProgram;
private String status;
private Date dInterview;
public Student() {
	super();
}
public Student(int applicationId, String fullName, Date dob,
		String highestQual, int marksObt, String goals, String emailId,
		String sProgram, String status, Date dInterview) {
	super();
	this.applicationId = applicationId;
	this.fullName = fullName;
	this.dob = dob;
	this.highestQual = highestQual;
	this.marksObt = marksObt;
	this.goals = goals;
	this.emailId = emailId;
	this.sProgram = sProgram;
	this.status = status;
	this.dInterview = dInterview;
}
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getHighestQual() {
	return highestQual;
}
public void setHighestQual(String highestQual) {
	this.highestQual = highestQual;
}
public int getMarksObt() {
	return marksObt;
}
public void setMarksObt(int marksObt) {
	this.marksObt = marksObt;
}
public String getGoals() {
	return goals;
}
public void setGoals(String goals) {
	this.goals = goals;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getsProgram() {
	return sProgram;
}
public void setsProgram(String sProgram) {
	this.sProgram = sProgram;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getdInterview() {
	return dInterview;
}
public void setdInterview(Date dInterview) {
	this.dInterview = dInterview;
}

}
