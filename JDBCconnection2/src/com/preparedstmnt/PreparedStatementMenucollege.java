package com.preparedstmnt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatementMenucollege {
	
	// 1. INSERT
	public static void insertstudent(Connection con, Scanner sc) throws SQLException {
		// FIXED: Used parseInt to avoid Scanner skipping bug
		System.out.print("  ID         : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("  Name       : ");
		String name = sc.nextLine();
		System.out.print("  Email      : ");
		String email = sc.nextLine();
		System.out.print("  Course     : ");
		String course = sc.nextLine();
		
		// FIXED: Consolidated table target to 'students'
		String sql = "INSERT INTO student (id, name, email, course) VALUES (?, ?, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, course);
			System.out.println("  Rows inserted: " + ps.executeUpdate());
		}
	}

	// 2. VIEW ALL
	public static void viewAllstudent(Connection con) throws SQLException {
		String sql = "SELECT * FROM student ORDER BY id";
		try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			System.out.printf("%n  %-5s %-20s %-20s %s%n", "ID", "Name", "Email", "Course");
			System.out.println("  " + "-".repeat(60));
			boolean any = false;
			while (rs.next()) {
				any = true;
				System.out.printf("  %-5d %-20s %-20s %s%n", 
						rs.getInt("id"), 
						rs.getString("name"),
						rs.getString("email"), 
						rs.getString("course"));
			}
			if (!any)
				System.out.println("  (no records)");
		}
	}

	// 3. SEARCH BY ID
	public static void searchstudent(Connection con, Scanner sc) throws SQLException {
		System.out.print("  Student ID: ");
		int id = Integer.parseInt(sc.nextLine());
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM student WHERE id = ?")) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next())
					System.out.printf("%n  ID: %d | Name: %s | Email: %s | Course: %s%n", 
							rs.getInt("id"),
							rs.getString("name"), 
							rs.getString("email"), 
							rs.getString("course"));
				else
					System.out.println("  Not found.");
			}
		}
	}

	// 4. UPDATE
	public static void updatestudent(Connection con, Scanner sc) throws SQLException {
		System.out.print("  ID to update   : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("  New Name       : ");
		String name = sc.nextLine();
		System.out.print("  New Email      : ");
		String email = sc.nextLine();
		System.out.print("  New Course     : ");
		String course = sc.nextLine();
		
		String sql = "UPDATE student SET name=?, email=?, course=? WHERE id=?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			// FIXED: Parameter indices must match their left-to-right appearance order
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, course);
			ps.setInt(4, id); 
			System.out.println(ps.executeUpdate() > 0 ? "  Updated!" : "  Not found.");
		}
	}

	// 5. DELETE
	public static void deletestudent(Connection con, Scanner sc) throws SQLException {
        System.out.print("  ID to delete: "); 
        int id = Integer.parseInt(sc.nextLine());
        try (PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE id=?")) {
            ps.setInt(1, id);
            System.out.println(ps.executeUpdate() > 0 ? "  Deleted!" : "  Not found.");
        }
	}

	// 6. MAIN 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // FIXED: Capitalisation to match your custom connection helper class
        try (Connection con = Dbconnectioncollege.getConnection()) {
            System.out.println("  Connected!");
            int choice;
            do {
                System.out.println("");
                System.out.println("  ===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("  1. Insert Student");
                System.out.println("  2. View All Students");
                System.out.println("  3. Search Student by ID");
                System.out.println("  4. Update Student");
                System.out.println("  5. Delete Student");
                System.out.println("  6. Exit");
                System.out.print("  Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: insertstudent(con, sc); break;
                    case 2: viewAllstudent(con);    break;
                    case 3: searchstudent(con, sc); break;
                    case 4: updatestudent(con, sc); break;
                    case 5: deletestudent(con, sc); break;
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
