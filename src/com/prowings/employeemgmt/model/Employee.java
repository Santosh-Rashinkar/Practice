package com.prowings.employeemgmt.model;

import java.util.Objects;

public class Employee {
	
	private int empid;
	private String name;
	private String department;
	
	public Employee(){
		
		    super();
	}
	
	public Employee(int empid,String name,String department){
		
		    super();
		
		this.empid = empid;
		this.name = name;
		this.department = department;
	}
	public Employee(int empid,String department){
		
		     super(); 

		this.empid = empid;
		this.department = department;
	}
	@Override
	public int hashCode(){
		
		return Objects.hash(department,empid,name);	
	}
	@Override
	public boolean equals (Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department)&& empid == other.empid && Objects.equals(name, other.name);
		
	}
	public String toString() {
		return "Employee[empid=" +empid +",name=" +name+",department="+department+"]";
	}
	
	public int getEmpid(){
		
		return empid+10;
	}
	public void setEmpid(int empid) {
		
		if(empid <=100)
		    this.empid = empid;
		else
			
			System.out.println("invalid id");	
	}
	public static void main(String[] args){
		
		Employee employee = new Employee();
		
		System.out.println(employee);
		
		Employee emp1 = new Employee(10,"Ram","pune");
		
//		emp1.empid = 20;
		
		emp1.setEmpid(20);
		
//		System.out.println(emp1.empid);
		
		System.out.println(emp1.getEmpid());
	}
}
