package com.abstraction;

abstract class Shape{
	public String color;
	
	
	public void display() {  //non abstract method
		System.out.println("Color: "+color);
	}
	public abstract double calculate();//abstract method
	
	public abstract void draw();
}

class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculate() {
		return 3.14*radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawn the circle "+radius);
	}
	
	
}

class Triangle extends Shape{
	double length;
	double width;
	
	public Triangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculate() {
		return length*width;
	}

	@Override
	public void draw() {
		System.out.println("Drawn the triangle length "+length+" width "+width);
	}

}

public class AbstarctClass {
	public static void main(String[] args) {
		Circle c=new Circle(3);
		System.out.println(c.calculate());
		c.draw();
		
		Triangle t=new Triangle(2, 3);
		System.out.println(t.calculate());
		t.draw();
	}
}
