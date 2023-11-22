package com.practice.basic.java;

import java.util.Scanner;

public class PalindromeChecker2 {

	public static boolean checkPalindrome(int number) {
		int originalNumber = number;
		int reversedNumber = 0;
		
		while (number > 0) {
			
			int value = number % 10;
			
			reversedNumber = reversedNumber * 10 + value;
			
			number /= 10;
		}
		return originalNumber == reversedNumber;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int inputNumber = scan.nextInt();
		
		if (checkPalindrome(inputNumber)) {
			
			System.out.println("Palindrome");
			
		} else {
			
			System.out.println("Not a Palindrome");
		}
		scan.close();
	}

}