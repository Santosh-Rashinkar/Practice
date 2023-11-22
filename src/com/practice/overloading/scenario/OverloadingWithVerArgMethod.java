package com.practice.overloading.scenario;

public class OverloadingWithVerArgMethod {

	public void add(int i, int j) {

		System.out.println("add(int i,int j)");
	}

	public void add(int a, long b) {

		System.out.println("add(int a,long b)");
	}

	public void add(Integer a, Integer b) {

		System.out.println("add(Integer a,Integer b)");
	}

	public void add(int... i) {

		System.out.println("add(int...i)");
	}
	public static void main(String[] args) {
		
		OverloadingWithVerArgMethod obj = new OverloadingWithVerArgMethod();
		
		obj.add(10,10);
		
	}

}
