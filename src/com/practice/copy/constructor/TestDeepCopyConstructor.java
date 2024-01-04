package com.practice.copy.constructor;

public class TestDeepCopyConstructor {

	public static void main(String[] args) {
		
		Address address = new Address(123,"pune","India");
		
		Student1 std1 = new Student1(10,"Ram",address);
		
		Student1 std2 = new Student1(std1);
		
		System.out.println("Before modification : ");
		
		System.out.println(std1);
		System.out.println(std2);
		
		System.out.println("After modification : ");
		
		std1.getAddress().setCity("mumbai");
		
		System.out.println(std1);
		System.out.println(std2);
	}
}