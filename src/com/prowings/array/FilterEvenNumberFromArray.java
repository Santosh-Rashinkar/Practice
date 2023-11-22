package com.prowings.array;

import java.util.Arrays;

public class FilterEvenNumberFromArray {

		public static void main(String[] args) {

			int[] arrayinput = { 2, 200, 65, 16, 71, 4, 12, 23, 48, 80, 32 };

			int[] res  = filterEvenNumbers(arrayinput);

			System.out.println("Filtered even numbers are : ");

			System.out.println(Arrays.toString(res));
		}

		public static int[] filterEvenNumbers(int[] arrayinput ) {
			
			System.out.println("Input array is :"+ Arrays.toString(arrayinput));

			int counter = 0;

			for (int i = 0; i < arrayinput.length; i++) {
				if (arrayinput[i] % 2 == 0) {
					counter++;
				}
			}

			int anotherCounter = 0;
			int[] result = new int[counter];

			for (int i = 0; i < arrayinput.length; i++) {
				if (arrayinput[i] % 2 == 0) {
					result[anotherCounter] = arrayinput[i];
					anotherCounter++;
				}
			}

			return result;
		}

	}