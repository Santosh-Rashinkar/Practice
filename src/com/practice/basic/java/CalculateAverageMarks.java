package com.practice.basic.java;

import java.util.Scanner;

public class CalculateAverageMarks {
	
	
      public static void main(String[] args) {
		
		int subject1,subject2,subject3,subject4,subject5,subject6;
		
		System.out.println("Enter marks for subject..");
		
		Scanner scan = new Scanner(System.in);
		
		subject1=scan.nextInt();
		subject2=scan.nextInt();
		subject3 =scan.nextInt();
		subject4=scan.nextInt();
		subject5=scan.nextInt();
		subject6=scan.nextInt();
		
		int sum =subject1+subject2+subject3+subject4+subject5+subject6;
		
		System.out.println("TotalMarks :"+sum);
		
		double average = sum / 6.0;
		
		System.out.println("AverageofMarks :"+average);
		
		scan.close();
      }

}
