package com.practice.basic.java;

import java.util.Scanner;

public class Expression {
	
	public static double calculateExpression(int x,int y) {
		return (4*Math.pow(x,2)+5*Math.pow(y, 3))/(2*x*y);
		
	}
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		
		int x = scan.nextInt();
		
		System.out.println("Enter the value of y: ");
		
		int y = scan.nextInt();
		
		double z = calculateExpression(x,y);
		
		System.out.println("The value of expression is: "+z);
		
		scan.close();
		
	}
}
