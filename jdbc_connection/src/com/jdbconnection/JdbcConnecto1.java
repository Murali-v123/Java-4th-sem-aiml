package com.jdbconnection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnecto1 {
	public static void main(String[] args) {
		try {
			//!.load the driver optional
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.connection
			String url="jdbc:mysql://localhost:3306/college_db";
			String name="root";
			String password="root";
			Connection connetion =DriverManager.getConnection(url, name, password);
			
			System.out.println("Conncetion sucessful!");
			System.out.println(connetion.getCatalog()); 
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
