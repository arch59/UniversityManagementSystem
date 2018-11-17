package com.cg.ums.dao;

public interface QueryConstants {
	public static final String GET_USER="SELECT * FROM Users WHERE uName=?";
	public static final String insertQuery = "insert into programs_offered values(?,?,?,?,?)";
	public static final String deleteQuery = "delete from programs_offered WHERE pName=?";
	public static final String updateQuery = "update programs_offered SET description=?,aEligibility=? WHERE pName=?";
}
