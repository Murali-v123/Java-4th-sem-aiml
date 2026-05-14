package com.classobject;

//	 static boolean isEven(int a) {
//		return a%2==0;
//	}
//for non static methods
//	 boolean isEven(int a) {
//			return a%2==0;
//		}
class Student {
	String name;
	int rollno;
	String isMale;

	void isWalking() {
		System.out.println("You are walking");
	}

	static void issleeping() { // static method
		System.out.println("You are sleeping");
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
//	for non staic method:ClassAndObject obj=new ClassAndObject();
//		boolean res=obj.isEven(21);
		// for static method
//		boolean res=isEven(21);
//		System.out.println(res);
		Student st1 = new Student();
		st1.name = "murali";
		st1.rollno = 123;
		st1.isMale = "male";
		System.out.println(st1.name);
		System.out.println(st1.rollno);
		System.out.println(st1.isMale);
		st1.isWalking();
		Student.issleeping();// static method
	}
}
