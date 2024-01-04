package com.prowings.pattern.printing.practice;

public class StarPattern4 {

//	int i = 3, j = 4;

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}