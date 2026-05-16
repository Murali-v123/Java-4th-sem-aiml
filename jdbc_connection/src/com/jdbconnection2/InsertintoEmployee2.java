package com.jdbconnection2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertintoEmployee2 {
	private static void insertEmployee(String username ,String password) {
		String sql = "SELECT * FROM users WHERE username=? AND password=?";


		
		try(Connection conn=DbConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){
				ps.setString(1, username);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("name"+rs.getString("username")
					+"password"+rs.getString("password"));
				}
			
		}catch(Exception e){
		e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		insertEmployee("Pradeep", "abcd");

	}
}
