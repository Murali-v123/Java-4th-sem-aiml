package com.classobject;

class Emp {
	String name;
	float salary;

	Emp(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
}

	public class Employee {
		public static void main(String[] args) {
			Emp e1 = new Emp("Murali", 150000);
			// e1.display();
			System.out.println(e1);
			Emp e2 = new Emp("pradeep", 150000);
			// e2.display();
			System.out.println(e2);
		}
	
}
