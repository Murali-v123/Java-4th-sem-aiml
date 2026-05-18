package com.dumpstudent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DumpStudent {

	// read and dump in db
	// How many rows to group into one batch before sending to DB
	private static final int BATCH_SIZE = 100;

	public static void loadFromFile(String filePath) {

		String sql = "INSERT INTO students (name, email, course, marks) VALUES (?,?,?,?)";

		// try-with-resources: auto-closes Connection and PreparedStatement
		try (Connection con = Dbstudent.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			// ── STEP A: Turn off auto-commit for transaction control ──
			con.setAutoCommit(false);

			// ── STEP B: Open the CSV file for reading ────────────────
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			String line;
			int count = 0; // tracks how many rows added to current batch
			int total = 0; // tracks total rows processed

			// ── STEP C: Read the file line by line ───────────────────
			while ((line = reader.readLine()) != null) {

				// Skip blank lines
				if (line.trim().isEmpty())
					continue;

				// Split CSV line into parts: name,email,course,marks
				String[] parts = line.split(",");
				if (parts.length < 4)
					continue; // skip malformed lines

				// Set values into PreparedStatement placeholders
				ps.setString(1, parts[0].trim()); // name
				ps.setString(2, parts[1].trim()); // email
				ps.setString(3, parts[2].trim()); // course
				ps.setInt(4, Integer.parseInt(parts[3].trim())); // marks

				// ── STEP D: Add this row to the batch queue ────────────
				ps.addBatch(); // queued! NOT sent to DB yet
				count++;
				total++;

				// ── STEP E: When batch is full, execute it ─────────────
				if (count == BATCH_SIZE) {
					ps.executeBatch(); // send 100 rows to DB in 1 call
					ps.clearBatch(); // clear the queue, free memory
					count = 0; // reset batch counter
					System.out.println("Inserted " + total + " rows so far...");
				}
			}
			reader.close();

			// ── STEP F: Execute any remaining rows (last partial batch) ─
			if (count > 0) {
				ps.executeBatch(); // insert the leftover rows
				ps.clearBatch();
			}
			// ── STEP G: Commit the transaction — save permanently ────
			con.commit();
			System.out.println("✅ Done! Total rows inserted: " + total);

		} catch (SQLException e) {
			System.err.println("❌ DB Error: " + e.getMessage());
			// rollback happens automatically when connection closes
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("❌ File Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		 System.out.println("=== JDBC Batch Processing Demo ===");
	        System.out.println("Starting file read and batch insert...");

	        // Path to our CSV file (relative to project root)
	        String filePath = "students.csv";

	        // Create the loader and start processing
	        loadFromFile(filePath);

	        System.out.println("=== Program Complete ===");
	}
}
