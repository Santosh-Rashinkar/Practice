package com.practice.basic.code.java;

public class Subtraction {

	public float subtractionOfNumber(float a, float b, float c) {

		System.out.println("subtraction method started...!!");

		float result = a - b - c;

		System.out.println("subtraction is :" + result);

		System.out.println("subtraction method ended...!!");

		return result;
	}

	public static void main(String[] args) {

		System.out.println("main method started...!!");

		Subtraction obj = new Subtraction();

		obj.subtractionOfNumber(90, 60, 10);

		System.out.println("main method ended...!!");
	}
}
