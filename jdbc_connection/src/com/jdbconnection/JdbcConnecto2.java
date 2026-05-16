package com.jdbconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcConnecto2 {
	public static void main(String[] args) {
		try {
			//1.load the driver optional
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.connection
			String url="jdbc:mysql://localhost:3306/college_db";
			String name="root";
			String password="root";
			Connection connection =DriverManager.getConnection(url, name, password);
			System.out.println("Conncetion sucessful!");
			System.out.println(connection.getCatalog());//to get database name 
			
			//to create statement
			Statement s=connection.createStatement();
			String sql="select * from student";
			
			//execute
			ResultSet executeQuery = s.executeQuery(sql);//shortcut ctrl+2+l;
			
			//display
			while(executeQuery.next()) {
				System.out.println("ID:"+executeQuery.getInt("id")+"| Name:"+executeQuery.getString("name")+"|Email:"+executeQuery.getString("email"));
			}
			connection.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
