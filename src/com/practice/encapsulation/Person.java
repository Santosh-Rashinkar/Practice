package com.practice.encapsulation;

public class Person {

	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return "name :" + name + ",Age : " + age;
	}

	public static void main(String[] args) {

		Person p = new Person();

		System.out.println(p.getAge());
		System.out.println(p.getName());

		p.setName("jay");
		p.setAge(30);

		System.out.println("======================");

		System.out.println(p.getAge());
		System.out.println(p.getName());

		System.out.println(p);
	}
}