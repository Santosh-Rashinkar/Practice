package com.practice.basic.loops;

import java.util.Scanner;

public class StringChecker {

	public static void main(String[] args) {
		
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a String : ");
      
      String s  = scan.nextLine();
      
      System.out.println("Enter a boolean value");
      
      boolean b = scan.nextBoolean();
      
      System.out.println(stringChecker(s,b));
      
      scan.close();

	}
	public static char stringChecker(String s, boolean b) {
		
//		schar[] charArray = s.toCharArray();
		
		if(b) { 
		
		return 97;
	}
		else {
		return 67;
		}
}
}


