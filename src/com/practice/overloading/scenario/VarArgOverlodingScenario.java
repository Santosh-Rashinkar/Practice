package com.practice.overloading.scenario;

public class VarArgOverlodingScenario {

	public void test(int i) {

		System.out.println("int i");

	}
	public void test(int...i) {
		
		System.out.println("int VerArgs");
	}
	public void test(char...i) {
		
		System.out.println("char VerArgs");
	}
	public static void main(String[] args) {
		
		VarArgOverlodingScenario obj = new VarArgOverlodingScenario();
		
//		obj.test('a');
//		obj.test(10);
//		obj.test(10,5,6);
//		obj.test('a','e','f','i','o');
		obj.test(999999999);	
	}
}
