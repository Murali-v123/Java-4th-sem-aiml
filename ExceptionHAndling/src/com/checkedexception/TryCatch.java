package com.checkedexception;

import java.io.PrintWriter;

public class TryCatch {
	public static void main(String[] args)   {
		PrintWriter pw=null;
		try {
			pw=new PrintWriter("hello.txt");
			pw.write("Hello World");
			System.out.println("sucess!");
		} catch (Exception e) {
			// type 1
			e.printStackTrace();
			//type 2
			System.out.println("File not found"+e);
			//type 3
			System.out.println(e);
		}
		finally {
			pw.close();
			System.out.println("Good bye");
		}
		System.out.println("bye bye");
	}
}
