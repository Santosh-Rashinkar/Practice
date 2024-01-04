package com.practice.copy.constructor;

public class Student1 {

	private int roll;
	private String name;
	private Address address;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
//	copy constructor!!
	
	public Student1(Student1 std) {
		
		this.roll = std.getRoll();
		this.name = std.getName();
		this.address = std.getAddress();
		
		
		
		
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
