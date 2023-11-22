package com.practice.overloading.scenario;

public class OverloadingTrickyExample {

	int overloadedMethod(int i) {
		return overloadedMethod(i *= i);
	}

	float overloadedMethod(float f) {
		return overloadedMethod(f *= f);
	}

	public static void main(String[] args) {

		OverloadingTrickyExample test = new OverloadingTrickyExample();

		test.overloadedMethod(100);
	}

}
