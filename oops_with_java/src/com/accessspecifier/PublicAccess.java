package com.accessspecifier;

class Person{
	public String name;
	private int age;
	int salary;
	
	
}
public class PublicAccess {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="pradeep";
		p1.salary=1000;
		System.out.println(p1.salary);
	}
}
