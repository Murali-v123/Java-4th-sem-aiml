package com.jdbconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConnecto3 {
	public static void main(String[] args) {
		try {
			
			//1.load the driver optional
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("com.mysql.cj.jdbc.Driver");
			//2.connection
			String url="jdbc:mysql://localhost:3306/employee";
			String name="root";
			String password="root";
		//	Connection connection = DriverManager.getConnection(url,name,password);
			Connection connection =DriverManager.getConnection(url, name, password);
			System.out.println("Conncetion sucessful!");
			System.out.println(connection.getCatalog());//to get database name 
			
			//to create statement
			Statement s=connection.createStatement();
			String sql = "CREATE TABLE employees ("+ " id INT AUTO_INCREMENT PRIMARY KEY,"
	                + " name VARCHAR(50) NOT NULL," + " salary double," + "dept varchar(100)" +");";
			
//			//execute
//			ResultSet executeQuery = s.executeQuery(sql);//shortcut ctrl+2+l;
//			
			//command for update query
			int executeUpdate=s.executeUpdate(sql);
//			//display
			System.out.println("sucessful"+executeUpdate+"effected");//to update the database
//			while(executeQuery.next()) {
//				System.out.println("ID:"+executeQuery.getInt("id")+"| Name:"+executeQuery.getString("name")+"|Email:"+executeQuery.getString("email"));
//			}
			connection.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
