package com.practice.array.program;

public class InsertionSort {

	public static void main(String[] args) {

		int[] nums = { 5, 1, 6, 2, 4, 3, 9, 8, 7 };

		InsertionSort.isInsertionSortArray(nums);

	}

	public static void isInsertionSortArray(int[] nums) {

		int temp;
		int j;

		for (int i = 1; i < nums.length; i++) {

			temp = nums[i];
			j = i;

			while (j > 0 && nums[j - 1] > temp) {

				nums[j] = nums[j - 1];
				j = j - 1;
			}
			nums[j] = temp;
		}

		for (int i : nums) {

			System.out.print((i) + " ");
		}
	}
}