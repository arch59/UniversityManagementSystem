package com.cg.ums.dao;

import java.sql.SQLException;

import com.cg.ums.bean.ProgramsOffered;
import com.cg.ums.exceptions.UMSExceptions;

public interface IAdminDao {

	int addPrograms(ProgramsOffered pOffered) throws UMSExceptions;

	int deleteProgram(String pName) throws UMSExceptions;

	int updateProgram(ProgramsOffered pOffered) throws UMSExceptions;

}
