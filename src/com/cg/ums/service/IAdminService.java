package com.cg.ums.service;

import com.cg.ums.bean.ProgramsOffered;
import com.cg.ums.exceptions.UMSExceptions;

public interface IAdminService  {

	int addPrograms(ProgramsOffered pOffered) throws UMSExceptions;

	int deleteProgram(String pName) throws UMSExceptions;

	int updateProgram(ProgramsOffered pOffered) throws UMSExceptions;

}
