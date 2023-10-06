package com.practice.basic.loops;

import java.util.Arrays;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		System.out.println("main method started");
		
		int[] number = {2, 3, 3, 2, 1 };

		System.out.println("Duplicate number in array");

		int[]result=findDuplicates(number);
		
		System.out.println("result"+Arrays.toString(result));
		
		System.out.println("main method Ended");
	}

	public static int[] findDuplicates(int[] number) {

		for (int i = 0; i < number.length; i++) {

			for (int j = i + 1; j < number.length; j++) {

				if (number[i] == number[j]) {

					System.out.println(number[i]);

				}
			}
		}
		return number;
	}
}