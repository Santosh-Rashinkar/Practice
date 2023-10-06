package com.practice.basic.code.java;

public class Multiplication {
	
	public int multiplicationOfNumber(int i,int j){

	System.out.println("multiplication method started...!!");
	
	int k = i*j;
	
	System.out.println("multiplication is :" +k);
	
	System.out.println("multiplication method ended...!!");
	
	return k;
	
	}

	public static void main(String[] args) {
	
		System.out.println("main method started...!!");
		
		Multiplication obj = new Multiplication();
		
		obj.multiplicationOfNumber(12, 9);
	
		System.out.println("main method ended...!!");

	}

}
