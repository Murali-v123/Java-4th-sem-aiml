package com.jdbconnection2;

import java.sql.Statement;
import java.sql.Connection;

public class InsertintoEmployee {
	private static void insertEmployee(String name, String dept, double salary) {
		String sql = "INSERT INTO employees(name, dept, salary) VALUES ('"
	            + name + "', '"
	            + dept + "', "
	            + salary + ")"; 
		try(Connection conn=DbConnection.getConnection();
			Statement s=conn.createStatement()){
				int rows=(s).executeUpdate(sql);
				System.out.println(rows +" is effected");
			
		}catch(Exception e){
		e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		insertEmployee("Pradeep", "it", 250000);
		insertEmployee("rohith", "it", 250000);
		insertEmployee("cheta","it",150000);

	}
}
