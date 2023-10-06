package com.practice.basic.java;

import java.util.Scanner;

public class Addition {
	
 public static int calculateAddition(int num1, int num2){
		
		return num1+num2;	
	}
	
 public static void main(String[] args){
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter two number :"); 
	 int num1 = scan.nextInt();
	 
	 int num2 = scan.nextInt();
	 
	 int Addition = calculateAddition(num1, num2);
	 
	 System.out.println("Addition is: "+Addition);
	 
	 scan.close(); 
   }
}
