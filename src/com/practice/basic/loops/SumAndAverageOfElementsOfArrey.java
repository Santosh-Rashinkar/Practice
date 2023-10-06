package com.practice.basic.loops;

public class SumAndAverageOfElementsOfArrey {

	public static void main(String[] args) {

		System.out.println("main method started");

		int[] nums = { 10, 20, 30, 40, 50, 60 };

		calculateSumAndAverage(nums);

		System.out.println("main method started");
	}

	public static void calculateSumAndAverage(int[] nums) {

		int sum = 0;

		for (int n : nums) {

			sum += n;
		}
		System.out.println("sum of all elements is : " + sum);

		int average = sum / nums.length;

		System.out.println("Average of all elements is : " + average);

	}
}