package com.practice.array.program;

public class ArraySort {

	public static void main(String[] args) {

		int[] nums = { 38, 15, 3, 12, 6, 1, };

		ArraySort.sortingArray(nums);
	}

	public static void sortingArray(int[] nums) {

		int min;
		int temp = 0;

		for (int i = 0; i < nums.length; i++) {

			min = i;
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[j] < nums[min]) {

					min = j;
				}

			}
			temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
		for (int i : nums) {

			System.out.print( (i) + " ");
		}
	}

}
