package com.practice.basic.loops;

	public class ArraySum {
		public static void main(String[] args) {
			int[] array1 = { 1, 2, 3, 4 };
			int[] array2 = { 5, 6, 7 };

			int[] sumArray = sumArraysElementWise(array1, array2);

			if (sumArray == null) {
				System.out.println("Arrays must have the same length for element-wise addition.");
			} else {
				System.out.println("Sum of two arrays:");
				for (int num : sumArray) {
					System.out.print(num + " ");
				}
			}
		}

		public static int[] sumArraysElementWise(int[] arr1, int[] arr2) {
			if (arr1.length != arr2.length) {
				return null; // Return null if arrays have different lengths
			}

			int[] sumArray = new int[arr1.length];

			for (int i = 0; i < arr1.length; i++) {
				sumArray[i] = arr1[i] + arr2[i];
			}

			return sumArray;
		}
	}