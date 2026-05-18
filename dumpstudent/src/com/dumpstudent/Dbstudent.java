package com.dumpstudent;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbstudent {
	static String url="jdbc:mysql://localhost:3306/batchdb";
	static String user="root";
	static String password="root";
	
	public static Connection getConnection() throws SQLException{
		Connection connection=DriverManager.getConnection(url,user,password);
		return connection;
	}
}
