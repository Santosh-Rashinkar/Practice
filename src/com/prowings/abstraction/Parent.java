package com.prowings.abstraction;

public abstract class Parent {

	int age;
	String name;

	public Parent(int age, String name) {

		this.age = age;
		this.name = name;

		System.out.println("in parents all arg contructor");
	}

	public Parent() {

		System.out.println("in parent class no arg constructor");

	}

	public abstract void printHello();

	public void printHii() {

		System.out.println("Hii");
		System.out.println("Hii");

	}

}
