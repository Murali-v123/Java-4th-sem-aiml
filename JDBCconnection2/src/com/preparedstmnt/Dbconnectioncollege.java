package com.preparedstmnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnectioncollege {
		static String url="jdbc:mysql://localhost:3306/college_db";
		static String name="root";
		static String password="root";
		public static Connection getConnection()  throws SQLException {
			Connection connection = DriverManager.getConnection(url, name, password);
			return connection;
	}
}