package com.practice.basic.loops;

public class ContinueStatement {

	public static void main(String[] args) {
		
        System.out.println("main started ");
        
		for (int i = 1; i <= 5; i++) {
			
			if (i == 3) {
				
				continue;
			}
			System.out.println(i);
		}
	}
}