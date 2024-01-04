package com.practice.basic.java;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number: ");

		int number = scan.nextInt();

		if (isPositive(number))

			System.out.println("Given " + number + " is Positive Number");

		else

			System.out.println("Given " + number + " is Negative Number");

		scan.close();
	}

	public static boolean isPositive(int number) {

		return number > 0;

	}

}
