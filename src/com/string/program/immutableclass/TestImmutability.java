package com.string.program.immutableclass;

public class TestImmutability {

	public static void main(String[] args) {
		
		Address addr = new Address(123, "pune", "India");
		
		ImmutableStudent s = new ImmutableStudent(10, "Ram", addr);
		
		System.out.println("Before modification : " + s);
		
//		addr.setCity("mumbai");
		
		s.getAddress().setCity("mumbai");
		
		System.out.println("After modification :" + s);		
	}
}