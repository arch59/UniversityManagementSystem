package com.cg.ums.service;

import com.cg.ums.bean.User;
import com.cg.ums.dao.IUniversityDao;
import com.cg.ums.dao.UniversityDaoIMPL;
import com.cg.ums.exceptions.UMSExceptions;

public class UniversityServiceIMPL implements IUniversityService{
IUniversityDao uDao = new UniversityDaoIMPL();
	@Override
	public String getRole(String uName, String password) throws UMSExceptions {
		 String role=null;
		User user = uDao.getUser(uName);
		if(user==null)
			throw new UMSExceptions("No Such UserName");
		else if(!password.equals(user.getPassword()))
			throw new UMSExceptions("Password Mismatch");
		else
			role=user.getRole();
		return role;
	}

	}


