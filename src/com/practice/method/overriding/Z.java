package com.practice.method.overriding;

public class Z extends Y {
	@Override
	void calculate(int a, int b) {

		System.out.println("class Z");
	}

	public static void main(String[] args) {

		X x = new X();

		x.calculate(20, 300);

//		Y y = (Y) x;
//		y.calculate(40,30);
	}

}