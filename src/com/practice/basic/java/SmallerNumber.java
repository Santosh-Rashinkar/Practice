package com.practice.basic.java;

import java.util.Scanner;

public class SmallerNumber {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Four numbers: ");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		int number4 = scan.nextInt();
		
		int result = displaySmallerNumber(number1,number2,number3,number4);
		
		System.out.print("Smaller Number is: "+result);
		
		scan.close();
	}
	public static int displaySmallerNumber(int number1,int number2,int number3,int number4){
		
		if(number1 <= number2 && number1 <= number3 && number1 <= number4){
			
			return number1;
			
		}
		else if(number2 <= number1 && number2 <= number3 && number2 <= number4){
			
			return number2;
			
		}
		else if(number3 <= number1 && number3 <= number2 && number3 <= number4){
			
			return number3;
			
		}
		else{
			
			return number4;
	   }
   } 
}
