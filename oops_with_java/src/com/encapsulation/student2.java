package com.encapsulation;

class Stdnt1{
	public String name;
	public int age;
	public String usn;
	
	
	@Override
	public String toString() {
		return "Stdnt [name=" + name + ", age=" + age + ", usn=" + usn + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			System.out.println("Enter valid age");
			return;
		}
		else {
			this.age=age;
		}
		
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}
	

}

public class student2 {
	public static void main(String[] args) {
		Stdnt1 s1=new Stdnt1();
		s1.setName("murali.v");
		s1.setUsn("ce24ai052");
		s1.setAge(-1);
		//System.out.println(s1);
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getUsn());
	}
}
