package com.practice.association.composition;

public class TestComposition {
	
	public static void main(String[] args) {

		Engine engine = new Engine("V12",true,true);
		
		Car car = new Car("audi",engine,2023);

		car.StartJourney();

	}

}
