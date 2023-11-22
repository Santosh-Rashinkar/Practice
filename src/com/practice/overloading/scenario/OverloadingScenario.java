package com.practice.overloading.scenario;

public class OverloadingScenario {

	void m1(int i) {

		System.out.println("int i");
	}

	void m1(long j) {

		System.out.println("long j");
	}

	public static void main(String[] args) {

		OverloadingScenario obj = new OverloadingScenario();

		obj.m1(999999999);
	}

}
