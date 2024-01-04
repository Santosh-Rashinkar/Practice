package com.practice.array.program;

public class ArrayType {

	public static void main(String[] args) {

		int[] number = { 10, 20, 30, 40 };

		int[][] matrix = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int[][][] cube = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } } };

		printOneDimensionalArray(number);
		printTwoDimensionalArray(matrix);
		printThreeDimensionalArray(cube);

	}
//	One-Dimensional Array:

//	Way -1
	public static void printOneDimensionalArray(int[] number) {

		System.out.println("1-D Function Started......!!!");

		for (int i = 0; i < number.length; i++) {

			System.out.print(number[i] + " ");
		}
		System.out.println();

//	Way -2 printing array for enhanced loop
		
//		for(int i:number) {
//			
//			System.out.print(i+" ");
//		}
		System.out.println("1-D Function Ended And Array Printed ");
		
	}
	
//  Two-Dimensional Array:

	public static void printTwoDimensionalArray(int[][] matrix) {

		System.out.println("2-D Function Started......!!!");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("2-D Function Ended And Array Printed");
	}
//	Three-Dimensional Array:

	public static void printThreeDimensionalArray(int[][][] cube) {

		System.out.println("3-D Function Started......!!!");

		for (int i = 0; i < cube.length; i++) {

			for (int j = 0; j < cube[i].length; j++) {

				for (int k = 0; k < cube[i][j].length; k++) {

					System.out.print(cube[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("3-D Function Ended And Array Printed");

	}
}