package com.string.all.methods;

public class StringLengthMethod {
	
	public static void main(String[] args) {
		
		
		String s1 ="Jay_Hanuman_";
		
		String s2 ="Jay_Shri_Ram";
		
		System.out.println("The size of the string s1 is : " + s1.length());
		System.out.println("The size of the string s2 is : " + s2.length());
		
		 compareLengthOfTwoString(s1,s2);
	}
	
	public static void compareLengthOfTwoString(String s1, String s2) {
		
		
		int input1 = s1.length();
		
		int input2 = s2.length();
		
		if(input1 == input2) {
			
			System.out.println("The length of both the  strings are equal and length is : "+ input1);
		}
		else {
			
			System.out.println("The length of both the Strings are not equal");
		}
	}

}
