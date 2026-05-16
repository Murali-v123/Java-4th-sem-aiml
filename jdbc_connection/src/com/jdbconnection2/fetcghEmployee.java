package com.jdbconnection2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class fetcghEmployee {
	private static void fetchEmployee() {
		String sql = "select * from employees";
		
		try(Connection conn=DbConnection.getConnection();
			Statement s=conn.createStatement()){
				ResultSet rs=s.executeQuery(sql);
				while(rs.next()) {
					System.out.println("Id: "+rs.getInt("id")+" Name: "+rs.getString("name")+"Depatement: "+rs.getString("dept")+"Salary: "+rs.getDouble("salary"));
				}
				
				System.out.println("This is the end");
				
		}catch(Exception e){
		e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		fetchEmployee();
	}
}
