package com.practice.basic.loops;

public class SumOfArray {

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 4, 7 };

	  additionOfArray(num1);
	}
	public static int additionOfArray(int[] num1) {
	
		int sum = 0;

		for (int add : num1) {

			sum += add;
		}
		
		System.out.println("The sum of element in the array: "+sum);
		
		return sum;
	}
}