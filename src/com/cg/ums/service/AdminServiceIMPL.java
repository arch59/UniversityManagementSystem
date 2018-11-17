package com.cg.ums.service;

import com.cg.ums.bean.ProgramsOffered;
import com.cg.ums.dao.AdminDaoIMPL;
import com.cg.ums.dao.IAdminDao;
import com.cg.ums.exceptions.UMSExceptions;

public class AdminServiceIMPL implements IAdminService {
	private IAdminDao dao = new AdminDaoIMPL();

	@Override
	public int addPrograms(ProgramsOffered pOffered) throws UMSExceptions {
		
		return dao.addPrograms(pOffered);
	}

	@Override
	public int deleteProgram(String pName) throws UMSExceptions {
		
		return dao.deleteProgram(pName);
	}

	@Override
	public int updateProgram(ProgramsOffered pOffered) throws UMSExceptions {
		
		int result = dao.updateProgram(pOffered);
		return result;
	}

}
