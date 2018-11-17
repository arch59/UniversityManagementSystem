package com.cg.ums.service;

import com.cg.ums.exceptions.UMSExceptions;

public interface IUniversityService {

	String getRole(String uName, String password) throws UMSExceptions;

}
