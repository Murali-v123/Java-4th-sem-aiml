package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Starting");
		try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
			String line;
			int lineNumber = 1;
			while ((line = br.readLine()) != null) {
				System.out.println("Line " + lineNumber + " : " + line);
				lineNumber++;
			}
		}
	}
}
