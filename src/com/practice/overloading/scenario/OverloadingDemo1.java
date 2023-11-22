package com.practice.overloading.scenario;

public class OverloadingDemo1 {

	public void add(int a, int b) {

		System.out.println("add(int a,int b)");
	}

	public void add(long a, int b) {

		System.out.println("add(long a,int b)");
	}

	public void add(int a, long b) {

		System.out.println("add(int a,long b)");
	}

	public static void main(String[] args) {

		OverloadingDemo1 demo1 = new OverloadingDemo1();

		long a = 10;

		demo1.add(a,10);
	}
}
