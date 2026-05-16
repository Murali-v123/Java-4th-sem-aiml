package com.checkedexception;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryCatch2 {
	public static void main(String[] args)   {
		File f=new File("hello.txt");
		Scanner s=null;
		try{
		s=new Scanner(f);
		while(s.hasNextLine()) {
			System.out.print(s.next());
		}
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println();
			System.out.println("Sucess!");
			s.close();
		}
		System.out.println("bye bye");
	}
}
