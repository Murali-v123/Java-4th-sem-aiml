package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[] args) throws Exception {
//		//fileWriter
//		FileWriter fileWriter2 = new FileWriter("sample.txt");
//		fileWriter2.write("hello");
//		fileWriter2.write("world");
//		fileWriter2.write("\n");
//		fileWriter2.write("pradeep");
//		fileWriter2.close();
//		
		//buffered writer
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sample1.txt"));
		bufferedWriter.write("hello");
		bufferedWriter.write("world");
		bufferedWriter.write("\n");
		bufferedWriter.write("pradeep");
		bufferedWriter.close();
		System.out.println("Complted");
	}
}
