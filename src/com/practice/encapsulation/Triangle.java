package com.practice.encapsulation;

public class Triangle extends Shape {

	public void area(int l, int h) {

		System.out.println(1/2*l*h);

	}
	public static void main(String[] args) {
		 
               Triangle t1 = new Triangle();
               t1.color = "red";
               t1.area();
               t1.myMethod();
	}

}
