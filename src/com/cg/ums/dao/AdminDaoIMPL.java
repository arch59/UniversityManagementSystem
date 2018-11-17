package com.cg.ums.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.ums.bean.ProgramsOffered;
import com.cg.ums.exceptions.UMSExceptions;
import com.cg.ums.utility.JDBCUtility;

public class AdminDaoIMPL implements IAdminDao {

	Connection connection = null;
	PreparedStatement statement = null;

	@Override
	public int addPrograms(ProgramsOffered pOffered) throws UMSExceptions {
		try {
			connection = JDBCUtility.getConnection();
			statement = connection.prepareStatement(QueryConstants.insertQuery);
			statement.setString(1, pOffered.getProgramName());
			statement.setString(2, pOffered.getDesc());
			statement.setString(3, pOffered.getaEligibility());
			statement.setInt(4, pOffered.getDuration());
			statement.setString(5, pOffered.getdCertificate());
			System.out.println("success");
			int result = statement.executeUpdate();
			return result;
		}

		catch (SQLException | ClassNotFoundException | IOException e) {
			throw new UMSExceptions("Not inserted");
		}
	}

	@Override
	public int deleteProgram(String pName) throws UMSExceptions {
		try {
			connection = JDBCUtility.getConnection();
			statement = connection.prepareStatement(QueryConstants.deleteQuery);
			statement.setString(1, pName);
			int result = statement.executeUpdate();
			return result;
		} catch (SQLException | ClassNotFoundException | IOException e) {
			throw new UMSExceptions("INVALID PROGRAM NAME");
		}

	}

	@Override
	public int updateProgram(ProgramsOffered pOffered) throws UMSExceptions {
		try{
		connection=JDBCUtility.getConnection();
		statement=connection.prepareStatement(QueryConstants.updateQuery);
		statement.setString(1,pOffered.getDesc());
		statement.setString(2, pOffered.getaEligibility());
		statement.setString(3, pOffered.getProgramName());
		int result = statement.executeUpdate();
		return result;
	}
	catch (SQLException | ClassNotFoundException | IOException e){
		throw new UMSExceptions("Nothing updated");
	}
		
	}
}
