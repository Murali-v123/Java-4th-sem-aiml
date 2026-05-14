package com.polymorphism;


class Caluculation{
	public int add(int a ,int b) {
		return a+b;
	}
	public int add(int a ,int b,int c) {
		return a+b+c;
	}
	public int sub(int a ,int b) {
		return a+b;
	}
	public int mul(int a ,int b) {
		return a+b;
	}
	public int div(int a ,int b) {
		return a+b;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Caluculation c=new Caluculation();
		int res=c.add(2, 3);
		int res1=c.add(2, 3,5);
		System.out.println(res);
		System.out.println(res1);
	}
}
