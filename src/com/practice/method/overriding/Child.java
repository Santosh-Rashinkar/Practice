package com.practice.method.overriding;

public class Child extends Parent {
	@Override
   	public void m1() {
   		System.out.println("child's m1() method !!!");
   	}
	public static void main(String[] args) {
		
		Parent ref = new Child();
			
		ref.m1();
		ref.m2();
		
	}
}