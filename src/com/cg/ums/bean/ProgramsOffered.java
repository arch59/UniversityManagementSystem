package com.cg.ums.bean;

import java.util.Date;

public class ProgramsOffered {
	private String programName;
	private String desc;
	private String aEligibility;
	private int duration;
	private String dCertificate;
	public ProgramsOffered() {
		super();
	}
	public ProgramsOffered(String programName, String desc,
			String aEligibility, int duration, String dCertificate) {
		super();
		this.programName = programName;
		this.desc = desc;
		this.aEligibility = aEligibility;
		this.duration = duration;
		this.dCertificate = dCertificate;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getaEligibility() {
		return aEligibility;
	}
	public void setaEligibility(String aEligibility) {
		this.aEligibility = aEligibility;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getdCertificate() {
		return dCertificate;
	}
	public void setdCertificate(String dCertificate) {
		this.dCertificate = dCertificate;
	}
	@Override
	public String toString() {
		return "ProgramsOffered [programName=" + programName + ", desc=" + desc
				+ ", aEligibility=" + aEligibility + ", duration=" + duration
				+ ", dCertificate=" + dCertificate + "]";
	}
}
	
