package com.practice.common.code;

public abstract class Test implements D{

	String name;
	int id;
	String address;
	String schoolname;

	public Test() {

		System.out.println("no-arg constructor");
	}

	public void m1(String s) {

		System.out.println(s);
	}
	
	abstract void m2();
	public  void m1() {
		System.out.println("it is static method present in my abstract class ");
	}
	public final void m3() {
		
		System.out.println(" it is my abstract class it can have final method ");
	}
	

	public Test(String name, int id, String address, String schoolname) {

		this.address = address;
		this.id = id;
		this.name = name;
		this.schoolname = schoolname;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + ", address=" + address + ", schoolname=" + schoolname + "]";
	}

//	public static void main(String[] args) {

//		Test obj = new Test("Ram",30,"Pune","ABC");

//		System.out.println(obj.toString());

//		obj.m1("Jay");
		
	}

//}
