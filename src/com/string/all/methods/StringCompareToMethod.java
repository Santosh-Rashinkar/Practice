package com.string.all.methods;

public class StringCompareToMethod {

	 public static void main(String[] args) {
	        String str1 = "apple";
	        String str2 = "banana";
	        String str3 = "apple";

	        int result1 = str1.compareTo(str2);
	        int result2 = str1.compareTo(str3);

	        System.out.println("Comparison result between str1 and str2: " + result1);
	        System.out.println("Comparison result between str1 and str3: " + result2);
	    }
}
