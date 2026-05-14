package operators;

import java.util.Scanner;

public class Oprts {
	public static void main(String[] args) {
		int a=25;
		int b=4;
		
		//to create scanner object
		Scanner obj1=new Scanner(System.in);
		
		//to take user input and print
		System.out.print("enter your name: ");
		String name=obj1.next();
		
		System.out.print("Enter marks: ");
		int mark = obj1.nextInt();
		
		System.out.print("Enter usn: ");
		String usn = obj1.next();
		
		System.out.print("enter your sec: ");
		String sec=obj1.next();
		
		System.out.print("enter your dept: ");
		String dept=obj1.next();
		
		System.out.println("name is: "+name);
		System.out.println("marks is: "+mark);
		System.out.println("usn is: "+usn);
		System.out.println("sec is: "+sec);
		System.out.println("dept is: "+dept);
		
		
		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.print(+(double)a/b);
	}

}
