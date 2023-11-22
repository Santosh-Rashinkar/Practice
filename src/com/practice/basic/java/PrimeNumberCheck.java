package com.practice.basic.java;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");

		int no = scan.nextInt();
//		int no = 5 ;
		int temp = 0;

		for (int i = 2; i <= no - 1; i++) {

			if (no % i == 0)

				temp = temp + 1;
		}
		if (temp == 0) {

			System.out.println(no + "is prime number");
		} else {

			System.out.println(no + "is not a prime number");
		}
		scan.close();
	}

}
