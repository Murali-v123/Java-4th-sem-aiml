package com.jdbconnection2;

import java.sql.Statement;
import java.sql.Connection;

public class UpdtaeEmployee2 {
	private static void updateEmployee(int id,String name, String dept, double salary) {
		String sql = "UPDATE employees SET "
				+ "name = '" +name + "', "
				+ "dept = '" + dept + "', "
				+ "salary = " + salary
				+ " WHERE id = " + id;;
		try(Connection conn=DbConnection.getConnection();
			Statement s=conn.createStatement()){
				int rows=(s).executeUpdate(sql);
				System.out.println(rows +" is effected");
			
		}catch(Exception e){
		e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		updateEmployee(5,"rohith", "it", 250000);
		updateEmployee(6,"cheta","it",150000);

	}
}
