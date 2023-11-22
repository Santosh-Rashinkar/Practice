package com.practice.objectclass.methods;

import java.util.Objects;

public class Employee {
	 int empId;
	String name;

	public Employee() {

		System.out.println("no-arg constructor");
	}

	public Employee(int empId, String name) {

		this.empId = empId;
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = result*prime + empId;
		result = result*prime + (name ==null ? 0 : name.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return empId == other.empId && Objects.equals(name, other.name);
//	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method invoked!!!!");
		super.finalize();
	}
	public boolean equals(Object anotherObject) {
	Employee other = (Employee) anotherObject;
	boolean res = false;
	if(this.empId == other.empId  &&  this.name.equals(other.name))
		res = true;
	
	return res;
}
	public static void main(String[] args) throws Throwable {
		
		Employee emp1 = new Employee(10, "Ram");
		Employee emp2 = new Employee(10, "Ram");
		
		emp1.finalize();
		Runtime.getRuntime();
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		
	System.out.println(emp1.equals(emp2));
		
		
		
		
	}
}