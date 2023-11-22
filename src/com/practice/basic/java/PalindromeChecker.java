package com.practice.basic.java;

public class PalindromeChecker {

	public static void checkPalindrome(String s) {

		char[] charArray = s.toCharArray();

		for (char ch : charArray) {

			System.out.println(ch);
		}

	}

	public static void main(String[] args) {

		PalindromeChecker.checkPalindrome("dad");
	}
}