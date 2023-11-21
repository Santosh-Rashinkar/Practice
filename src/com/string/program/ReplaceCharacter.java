package com.string.program;

public class ReplaceCharacter {
	
	public static void main(String[] args) {
		
		 String str = "Apple";
		 char oldchar ='p';
		 char newchar ='@';
		 String replace = replacechar(str,oldchar,newchar);
	 	 
		 System.out.println("Original String: "+ str);
		 System.out.println("String AfterReplaceChar: " + replace);
	}

	public static String replacechar(String str, char oldchar, char newchar) {
		return str.replace(oldchar, newchar);
		
	}

}
