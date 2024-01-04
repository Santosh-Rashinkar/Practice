package com.practice.basic.java;

public class PalindromeChecker3 {

	public static void checkPalindrome(String s) {

		String reversedString = "";

		char[] charArray = s.toCharArray();
		
		for(char ch : charArray ) {
		
			System.out.println(ch);
		}

		for (int i = s.length() - 1; i >= 0; i--) {

			reversedString = reversedString + s.charAt(i);

		}
		System.out.println(reversedString);

		if (s.equals(reversedString))

			System.out.println("is a palindrome");

		else
			
			System.out.println("is not a palindrome");

	}

	public static void main(String[] args) {

		PalindromeChecker3.checkPalindrome("mom");
	}
}