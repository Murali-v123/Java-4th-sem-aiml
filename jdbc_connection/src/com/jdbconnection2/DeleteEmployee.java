package com.jdbconnection2;

import java.sql.Statement;
import java.sql.Connection;

public class DeleteEmployee {
	private static void deleteEmployee(int id) {
		String sql = "delete from employees  WHERE id = " + id;;
		try(Connection conn=DbConnection.getConnection();
			Statement s=conn.createStatement()){
				int rows=(s).executeUpdate(sql);
				System.out.println(rows +" is effected");
			
		}catch(Exception e){
		e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		deleteEmployee(5);
		deleteEmployee(7);

	}
}
