package com.preparedstmnt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementMenu {
	// 1. INSERT
	public static void insertEmployee(Connection con, Scanner sc) throws SQLException {
		System.out.print("  Name       : ");
		String name = sc.nextLine();
		System.out.print("  Department : ");
		String dept = sc.nextLine();
		System.out.print("  Salary     : ");
		double salary = Double.parseDouble(sc.nextLine());
		String sql = "INSERT INTO employees (name, dept, salary)" + " VALUES (?, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, dept);
			ps.setDouble(3, salary);
			System.out.println("  Rows inserted: " + ps.executeUpdate());
		}
	}

	// 2. VIEW ALL
	public static void viewAllEmployees(Connection con) throws SQLException {
		String sql = "SELECT * FROM employees ORDER BY id";
		try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			System.out.printf("%n  %-5s %-20s %-14s %s%n", "ID", "Name", "Department", "Salary");
			System.out.println("  " + "-".repeat(55));
			boolean any = false;
			while (rs.next()) {
				any = true;
				System.out.printf("  %-5d %-20s %-14s %.2f%n", rs.getInt("id"), rs.getString("name"),
						rs.getString("dept"), rs.getDouble("salary"));
			}
			if (!any)
				System.out.println("  (no records)");
		}
	}

	// 3. SEARCH BY ID
	public static void searchEmployeeById(Connection con, Scanner sc) throws SQLException {
		System.out.print("  Employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE id = ?")) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next())
					System.out.printf("%n  ID:%d  Name:%s  Dept:%s  Salary:%.2f%n", rs.getInt("id"),
							rs.getString("name"), rs.getString("dept"), rs.getDouble("salary"));
				else
					System.out.println("  Not found.");
			}
		}
	}

	// 4. UPDATE
	public static void updateEmployee(Connection con, Scanner sc) throws SQLException {
		System.out.print("  ID to update   : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("  New Name       : ");
		String name = sc.nextLine();
		System.out.print("  New Department : ");
		String dept = sc.nextLine();
		System.out.print("  New Salary     : ");
		double sal = Double.parseDouble(sc.nextLine());
		String sql = "UPDATE employees SET name=?,dept=?,salary=? WHERE id=?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, dept);
			ps.setDouble(3, sal);
			ps.setInt(4, id);
			System.out.println(ps.executeUpdate() > 0 ? "  Updated!" : "  Not found.");
		}
	}

	// 5. DELETE
	public static void deleteEmployee(Connection con, Scanner sc)
            throws SQLException {
        System.out.print("  ID to delete: "); int id = Integer.parseInt(sc.nextLine())
;
        try (PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employees WHERE id=?")) {
            ps.setInt(1, id);
            System.out.println(ps.executeUpdate()>0
                ? "  Deleted!" : "  Not found.");
        }
	}

	  //  6. MAIN 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection con = Dbconnection.getConnection()) {
            System.out.println("  Connected!");
            int choice;
            do {
                System.out.println("");
                System.out.println("  ===== EMPLOYEE MANAGEMENT SYSTEM =====");
                System.out.println("  1. Insert Employee");
                System.out.println("  2. View All Employees");
                System.out.println("  3. Search Employee by ID");
                System.out.println("  4. Update Employee");
                System.out.println("  5. Delete Employee");
                System.out.println("  6. Exit");
                System.out.print  ("  Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: insertEmployee(con, sc);     break;
                    case 2: viewAllEmployees(con);       break;
                    case 3: searchEmployeeById(con, sc); break;
                    case 4: updateEmployee(con, sc);     break;
                    case 5: deleteEmployee(con, sc);     break;
                    case 6: System.out.println("  Goodbye!"); break;
                    default: System.out.println("  Invalid. Enter 1-6.");
                }
            } while (choice != 6);
        } catch (SQLException e) {
            System.err.println("  DB error: " + e.getMessage());
        }
        sc.close();
    }
}
