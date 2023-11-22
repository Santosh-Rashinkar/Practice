package com.practice.overloading.scenario;

public class OverloadingWithVerArgMethod1 {

	public void m1(char c) {
		
		System.out.println("m1(char c)");
	}
	
//	public void m1(char[] c) {
//		
//		System.out.println("m1(char[] c)");
//	}
//	
//	public void m1(int c) {
//		
//		System.out.println("m1(int c)");
//	}
	public void m1(int[] c) {
		
		System.out.println("m1(int[] c)");
	}
	
//	public void m1(int... i) {
//		
//		System.out.println("m1(int... i)");
//	}
	
//	public void m1(character... i) {
//		
//		System.out.println("m1(int... i)");
//	}
	
//	public void m1(char... i) {
//		
//		System.out.println("m1(int... i)");
//	}
	
	public static void main(String[] args) {
		
	
	OverloadingWithVerArgMethod1 obj = new OverloadingWithVerArgMethod1();
	
      char c ='a';
      obj.m1(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
