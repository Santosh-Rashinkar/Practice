package com.practice.basic.java;

public class PrintStringInSingle {

	public static void printStringInCharacter(String s) {

		char[] charArray = s.toCharArray();

		for (char ch : charArray) {

			System.out.println(ch);
		}
	}
	public static void main(String[] args) {

		PrintStringInSingle.printStringInCharacter("dad");
	}
}