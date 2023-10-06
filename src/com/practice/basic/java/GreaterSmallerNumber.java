package com.practice.basic.java;

import java.util.Scanner;

public class GreaterSmallerNumber {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first Number: ");
		int number1 = scan.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int number2 = scan.nextInt();
		
		displayGreaterSmaller(number1,number2);
		
		scan.close();
	    }
	static void displayGreaterSmaller(int a,int b){
		if(a > b){
			System.out.println("Greater Number is: "+a);
			System.out.println("Smaller Number is: "+b);	
		}
		else if(b > a){
			System.out.println("Greater Number is: "+b);
			System.out.println("Smaller Number is: "+a);
		}
		else{
			System.out.println("Both Numbers are equal: "+a);
			
		}	
	}
}
