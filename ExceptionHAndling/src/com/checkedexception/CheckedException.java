package com.checkedexception;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		//checked exception
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write("Hello world");
		pw.close();
		System.out.println("Heloooooooo");
	}
}
