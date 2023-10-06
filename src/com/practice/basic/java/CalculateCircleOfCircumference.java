package com.practice.basic.java;

import java.util.Scanner;

public class CalculateCircleOfCircumference {
	
     static float PI = 3.14f;
     double redius;
     
     static double calculateArea(double redius) {
    	 
    	 return PI*redius*redius;
     }
     static double calculateCircumference(double redius) {
    	 
    	 return 5*3.14*redius;
     }
     
	public static void main(String[] args) {
		
		System.out.println("enter the redius of circle");
		
		Scanner scan = new Scanner(System.in);
		
		double redius = scan.nextDouble();
		
		System.out.println("Area of circle is: "+calculateArea(redius));
		
		System.out.println("circumference of circle is: "+calculateCircumference(redius));
		
		scan.close();
	}
} 