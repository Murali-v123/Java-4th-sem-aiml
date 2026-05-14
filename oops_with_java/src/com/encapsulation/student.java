package com.encapsulation;

class Stdnt{
	public String name;
	public int age;
	public String usn;
	
	
	@Override
	public String toString() {
		return "Stdnt [name=" + name + ", age=" + age + ", usn=" + usn + "]";
	}

}

public class student {
	public static void main(String[] args) {
		Stdnt s1=new Stdnt();
		s1.name=" ";
		s1.age=-2;
		s1.usn="1c22er";
		System.out.println(s1);
	}
}
