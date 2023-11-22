package com.practice.association.composition;

public class Engine{

		String name;
		boolean fuel;
		boolean engineOil;

		public Engine() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Engine(String name, boolean fuel, boolean engineOil) {
			super();
			this.name = name;
			this.fuel = fuel;
			this.engineOil = engineOil;
		}



		public boolean start()
		{
			if(fuel && engineOil)
			{
				System.out.println("Engine started!!!");
				return true;
			}
			else
			{
				System.out.println("Engine can not be started without Fuel or Oil!!");
				return false;
			}
		}

	}