package com.practice.basic.java;

public class MixCodeBasic {
	
	 int roll;
	 String name;
     String address1;
	

	public static int addition(int a, int b)
	{
		int c = a+b;
		
		System.out.println("addition is :" +c);
		
		return c;	
	}
	
	static{
		
		System.out.println("static block practice program-111!!!");
		
	}
	
	public MixCodeBasic(){
		
		System.out.println("inside no arg constructor...!!");
		
	}
	
	public MixCodeBasic(int roll,String name,String address1){
		
		System.out.println("constructor started..!!");
		this.roll = roll;
		this.name = name;
		this.address1 = address1;
		
		System.out.println(roll);
	    System.out.println(name);
	    System.out.println(address1);
	    
	    System.out.println("constructor ended..!!");
	    
	}
	public  float sub(float x, float y)
	{
		float res = x-y;
		
		System.out.println("subtraction is :" +res);
		
		return res;
	}
	public  MixCodeBasic(String address1)
	{
		System.out.println("1-arg constructor started..!!");
		
		this.address1 = address1;
		
		System.out.println(address1);
		
		System.out.println("1-arg constructor ended..!!");
	}
	
	{
		System.out.println("instance block statement-111");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method started...!!");
		
		addition(40,40);
		
		 MixCodeBasic t1 = new  MixCodeBasic(10,"ram","pune");
		
//		 MixCodeBasic t2 = new  MixCodeBasic("Aahilyanagar");
		 
		t1.sub(80,50);
		
		System.out.println("main method ended...!!");
	}
}