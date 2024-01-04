package com.practice.array.program;

public class ArrayTest {

	public static void main(String[] args) {

		System.out.println("main method Started..!!!");

		int[] nums = { 10, 20, 30, 40, 50 };

		ArrayTest.printArray(nums);

		System.out.println("main method Ended..!!!");
	}

	public static void printArray(int[] nums) {

		System.out.println("printArray method Started..!!!");
//Way 1 :
		
		for (int i = 0; i < nums.length; i++) {

			System.out.println(nums[i]);
		}

//Way 2 :
		
		for(int i:nums) {
			
			System.out.println(i);
		}
		
		System.out.println("printArray method Ended..!!!");
	}

}