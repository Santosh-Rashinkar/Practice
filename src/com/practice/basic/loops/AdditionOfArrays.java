package com.practice.basic.loops;

public class AdditionOfArrays {

	public AdditionOfArrays() {
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int[] nums1 = { 4, 5, 6, 7 };

		int[] result = additionOfArray(nums, nums1);
		for (int n : result)
			System.out.print(n + " ");
	}

	static int[] mergeArray(int[] additionOfArray, int[] nums, int nums1[], int size) {
		int[] mergedArray = additionOfArray;
		for (int i = nums.length; i < size; i++) {
			mergedArray[i] = nums1[i];
		}

		return mergedArray;
	}

	private static int[] additionOfArray(int[] nums, int[] nums1) {

		int size = 0;
		if (nums.length < nums1.length)
			size = nums1.length;
		else
			size = nums.length;

		int[] additionOfArray = new int[size];

		for (int i = 0; i < nums.length && i < nums1.length; i++) {
			additionOfArray[i] = nums[i] + nums1[i];
		}

		int[] result = new int[size];
		if (nums.length < nums1.length)
			result = mergeArray(additionOfArray, nums, nums1, size);
		else
			result = mergeArray(additionOfArray, nums1, nums, size);

		return result;
	}

}
