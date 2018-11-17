package com.cg.ums.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.ums.bean.User;
import com.cg.ums.exceptions.UMSExceptions;
import com.cg.ums.utility.JDBCUtility;

public class UniversityDaoIMPL implements IUniversityDao{

	@Override
	public User getUser(String uName) throws UMSExceptions {
		User user = null;
	try(
				Connection con = JDBCUtility.getConnection();
				PreparedStatement st = con.prepareStatement(QueryConstants.GET_USER);
			){
			
			st.setString(1, uName);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				user = new User();
				user.setuName(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setRole(rs.getString(3));
			}
}catch(SQLException | ClassNotFoundException | IOException e){
	throw new UMSExceptions("No such user exists");
}
	return user;
	}
}
