package com.practice.basic.code.java;

public class Employee {
	
		int id;
		String name;
		String dept;
		
		public Employee()
		{
			
		}
		public Employee(int id)
		{
		this.id=id;
		}
		public Employee(int id, String name)
		{
			this.id=id;
			this.name=name;
		}
		public Employee(int id,String name,String dept)
		{
			this.id=id;
			this.name=name;
			this.dept=dept;
		}
		public static void main(String[]args)
		{
		
		Employee e1=new Employee();
		
		e1.id=8;
		
		System.out.println(e1.id);
		
		Employee e2=new Employee();
		
	 	e2.id=9;
		e2.name="santosh";
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		
		Employee e3=new Employee();
		
		e3.id=10;
		e3.name="Ram";
		e3.dept="HR";
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.dept);
		
		}
	}