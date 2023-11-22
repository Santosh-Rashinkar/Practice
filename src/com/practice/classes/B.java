package com.practice.classes;

public class B extends A {
//	public abstract void myMethod(); // abstract method

	public void simpleMethod() { // concrete method

		System.out.println("this is my child class method1111...111.!!!! ");
	}

	public void showMyMethod() { // concrete method

		System.out.println("this is my child class method...2222!!!! ");
	}

	public void javaMethod() { // concrete method

		System.out.println(" method is my child class method....3333!!!!");
	}

	public void simple() { // concrete method

		System.out.println(" method is my child class method....4444!!!! ");
	}

	public void method123() { // concrete method

		System.out.println(" method is my  child class  method....5555!!!! ");
	}

	public static void main(String[] args) {

		A a1 = new A(); // create object for parent class.

		A a2 = new B();

		a1.javaMethod();

		a2.showMyMethod();

		// a.javaMethod();

		 B b1 =new B();

		// b1.method123();

		// B b2 = new A(); this is invalid because child cannot hold parent object

		 B b3 = (B)a2;

		// a2.simple();
		b3.simple(); // child 
		A a3 = b1;  //
		a3.simple();
	}



}
