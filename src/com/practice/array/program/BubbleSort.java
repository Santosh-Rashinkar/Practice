package com.practice.array.program;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = { 45, 15, 42, 12, 18, 10, 5, 2 };

		BubbleSort.printBubbleSort(nums);
	}

	public static void printBubbleSort(int[] nums) {

		int temp;

		for (int i = 0; i < nums.length; i++) {

			int flag = 0;

			for (int j = 0; j < nums.length - 1 - i; j++) {

				if (nums[j] > nums[j + 1]) {

					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					flag = 1;

				}
			}

			if (flag == 0) {

				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + " ");
		}
	}
}
