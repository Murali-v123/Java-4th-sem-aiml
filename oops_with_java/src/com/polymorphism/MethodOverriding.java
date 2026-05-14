package com.polymorphism;

class Shape{
	public void draw(){
		System.out.println("HEllo world");
	}
}

class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("HEllo circle");
	}
}

class Triangle extends Shape{
	@Override
	public void draw(){
		System.out.println("HEllo Triagle");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Shape s=new Circle(); //up,casting-storing child in parent
		Shape s1=new Shape();
		Triangle t=new Triangle();
		s.draw();
		t.draw();
		s1.draw();
	}
}
