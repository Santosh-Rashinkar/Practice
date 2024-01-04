package com.string.all.methods;

public class StringSubstringMethod_2 {
	
	public static void main(String[] args) {

		String a = "newspaper";

		a = a.substring(5, 7);
		
		System.out.println(a);
		
		char b = a.charAt(1);
		a = a + b;
		System.out.println(a);
	}
}
// Substring(int beginIndex , int endIndex)
// e.g -> String s = "abcdefg"
//s.o.p.ln(s.substring(3));             output  defg 
//s.o.p.ln(s.substring)(2,5);        output     cde