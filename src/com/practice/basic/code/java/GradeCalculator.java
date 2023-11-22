package com.practice.basic.code.java;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the student's score");

		int score = scan.nextInt();

		gradeCalculator(score);

		scan.close();
	}

	public static String gradeCalculator(int score) {

		if (score >=90) {
			System.out.println("The student's grade is : A++ with distension");
		} 
		else if (score >=81) {

			System.out.println("The student's grade is: A");
		} 
		else if (score >=71) {

			System.out.println("The student's grade is: B");
		} 
		else if (score >=61) {

			System.out.println("The student's grade is: C");
		} 
		else if (score >=51) {

			System.out.println("The student's grade is: D");
	    }
		else if (score >=40) {
			
			System.out.println("The student's grade is: E");
		}
		
		else {
			
			System.out.println("The student's grade is: Fail");
		}
		
		return "score";
	}
}
