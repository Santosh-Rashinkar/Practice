package com.practice.basic.loops;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		int number[]= {10,20,30,40,50};
		
		for(int b : number) {
			
			System.out.println(b + " ");
		}
		for(int i=0; i<number.length; i++) {
			
			System.out.println(number[i]+ " ");
		}
	}
}