package com.practice.overloading.scenario;

public class Test1 {

	public void m1(String s) {

		System.out.println("String s ");
	}

	public void m1(Object o) {

		System.out.println("Object o ");
	}
	public void m1(StringBuffer sb) {
		
		System.out.println("StringBuffer ");
	}

	public static void main(String[] args) {

		Test1 t = new Test1();

		t.m1(new Object());
		
		t.m1("santosh");

//		t.m1(null); // Overloading time child class is high priority So
//		                              child method is first call and you got ambiguous error
		
	}

}
