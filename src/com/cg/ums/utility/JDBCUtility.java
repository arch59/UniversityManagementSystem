package com.cg.ums.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtility {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{
		Properties properties = new Properties();
		File file = new File("res/db.properties");
		FileInputStream inputStream = new FileInputStream(file);
		properties.load(inputStream);
		String driver = properties.getProperty("db.driver");
		String url = properties.getProperty("db.url");
		String username = properties.getProperty("db.username");
		String password = properties.getProperty("db.password");
		Class.forName(driver);
		connection = DriverManager.getConnection(url,username,password);
		System.out.println("connected..");
		return connection;
		
	}

}
