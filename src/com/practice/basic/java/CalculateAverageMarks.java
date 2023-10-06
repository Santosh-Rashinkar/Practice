package com.practice.basic.java;

import java.util.Scanner;

public class CalculateAverageMarks {
	
	
      public static void main(String[] args) {
		
		int a,b,c,d,e;
		
		System.out.println("Enter marks for subject..");
		
		Scanner scan = new Scanner(System.in);
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		e=scan.nextInt();
		
		int sum =a+b+c+d+e;
		
		System.out.println("TotalMarks :"+sum);
		
		double average = sum / 5.0;
		
		System.out.println("AverageofMarks :"+average);
		
		scan.close();
      }

}
