package com.cg.ums.dao;

import com.cg.ums.bean.User;
import com.cg.ums.exceptions.UMSExceptions;


public interface IUniversityDao {

	User getUser(String uName) throws UMSExceptions;

}
