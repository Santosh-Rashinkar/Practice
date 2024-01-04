package com.practice.basic.java;

public class PrimeNumberCheck2 {

	public static void main(String[] args) {

		int temp = 0;

		System.out.println("This is all prime numbers ");

		for (int number = 1; number <= 100; number++) {

			for (int i = 2; i <= number - 1; i++) {

				if (number % i == 0)

					temp = temp + 1;
			}
			if (temp == 0) {

				System.out.println(number);
			} 
			else {
				temp = 0;
			}
//this number is prime numbers in 1 to 100//1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
		}
	}
}