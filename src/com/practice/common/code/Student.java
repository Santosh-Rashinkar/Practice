package com.practice.common.code;

public class Student implements Cloneable {

	int rollno;
	String address;
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String address) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;

		System.out.println(rollno + "" + name + "" + address);

	}

	public Student(String address, String name, int rollno) {

		this.rollno = rollno;
		this.address = address;
		this.name = name;

		System.out.println(address + "" + name + "" + rollno + "");

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student(10, "santosh", "pune");

		// Student s2 =(Student)s1.clone();
		Student s2 = s1;

		System.out.println(s1 == s2);
//		Student s2 =new Student("sanjay","Mumbai",20);

	}

}