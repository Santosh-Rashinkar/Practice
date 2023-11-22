package com.practice.overloading.scenario;

public class TestOverloading1 {
	
	public void m1(int i) {
		
		System.out.println("int i");
	}
	public void m1(float f) {
		
		System.out.println("float f");
	}
	
	public static void main(String[] args) {
		
		TestOverloading1 t1 = new TestOverloading1();
		
		t1.m1(10);
		t1.m1(10.5f);
		t1.m1(10l);
		t1.m1('a');
//		t1.m1(10.5); //  we got compile error in this line 
		
		
	}

}
