package com.practice.association.composition;

public class Car {

	String name;
	int model;
	Engine Engine;

	public Car() {
		super();
		System.out.println("inside no arg constructor");
	}

	public Car(String name, Engine engine, int model) {
		super();
		this.name = name;
		this.Engine = engine;
		this.model = model;

	}

	public void StartJourney() {

		if (Engine != null) {

			if (Engine.start())
				System.out.println("car starting moving!!!!");
		}
		else
			System.out.println("car can not started without engine!!");
	}

}