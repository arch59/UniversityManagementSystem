package com.cg.ums.bean;

import java.util.Date;

public class ProgramsScheduled {
	private int sProgramId;
	private String pName;
	private String location;
	private Date startDate;
	private Date endDate;
	public ProgramsScheduled() {
		super();
	}
	public ProgramsScheduled(int sProgramId, String pName, String location,
			Date startDate, Date endDate) {
		super();
		this.sProgramId = sProgramId;
		this.pName = pName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getsProgramId() {
		return sProgramId;
	}
	public void setsProgramId(int sProgramId) {
		this.sProgramId = sProgramId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	

}
