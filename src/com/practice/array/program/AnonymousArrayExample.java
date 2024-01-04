package com.practice.array.program;

public class AnonymousArrayExample {

	public static void main(String[] args) {

		AnonymousArrayExample.sum(new int[] { 10, 20, 30 });
	}

	public static void sum(int[] no) {

		int total = 0;

		for (int i : no) {

			total = total + i;
		}

		System.out.println("sum is :" + total);
	}

}