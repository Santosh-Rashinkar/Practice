package com.practice.objectCloning.shallow;

public class Student {

	private int roll;
	private String name;
	private String address;

	public Student() {
		super();
		
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

//	<<<<< copy constructor  A>>>>>>>
	public Student(Student std) {

		this.roll = std.getRoll();
		this.name = std.getName();
		this.name = std.getAddress();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
