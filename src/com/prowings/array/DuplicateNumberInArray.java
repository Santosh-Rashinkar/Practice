package com.prowings.array;

import java.util.Arrays;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		System.out.println("main method started");

		int[] a = { 4, 5, 4, 5, 3, 3, 1, 2 };

		findDuplicates(a);

		System.out.println(" are filtered duplicate numbers ");

		System.out.println("main method Ended");
	}

	public static int[] findDuplicates(int[] a) {

		System.out.println("input Array :" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.print(a[i] + "  ");

				}
			}
		}

		return a;
	}
}