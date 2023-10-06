package com.practice.basic.loops;

import java.util.Arrays;

public class FilterEvenNumberFromArray {

	public static void main(String[] args) {

		int[] nums = { 2, 200, 65, 16, 71, 4, 12, 23, 48, 80, 32 };

		int[] result = filterEvenNumber(nums);

		System.out.println("filtered even number are : ");

		System.out.println(Arrays.toString(result));

	}

	public static int[] filterEvenNumber(int[] nums) {

		System.out.println("Input array is :" + Arrays.toString(nums));

		int count = 0;

		for (int i = 0; i < nums.length; i++)

			if (nums[i] % 2 == 0) {

				count++;
			}

		int anotherCounter = 0;

		int[] result = new int[count];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				result[anotherCounter] = nums[i];

				anotherCounter++;
			}

		}
		return result;
	}
}
