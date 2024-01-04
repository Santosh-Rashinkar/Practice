package com.practice.exception.handling;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");


		int a = 10;
		int b = 0;
		int c;
		
		try {
			c = a / b;
			System.out.println(c);	
		} 
		catch (ArithmeticException e) {

			System.out.println("Cannot devide by zero");
		}
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		System.out.println("main method ended");
	}

}