package com.prowings.abstraction;

public class Child extends Parent {

	public Child() {
		System.out.println("child no arg constructor!!!");
	}

	public Child(int age, String name) {

		super(age, name);

	}

	public static void main(String[] args) {

		Child c = new Child();

		System.out.println(c.age);

		System.out.println(c.name);

		c.printHii();
		c.printHello();

//		Parent p = new Parent(10, "Ram"); //this is invalid as we can not instantiate abstract class

		Child c2 = new Child(20, "Ram");

		System.out.println(c2.age);

		System.out.println(c2.name);

		c2.printHii();
		c2.printHello();
	}

	@Override
	public void printHello() {
		System.out.println("Hello");
		System.out.println("Hello");

	}

}