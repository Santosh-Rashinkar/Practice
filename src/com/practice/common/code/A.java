package com.practice.common.code;

public class A {
	
	int id;
	String name;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}

	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void m1() {
		
		System.out.println("parent class method m1() ");
	}
}
