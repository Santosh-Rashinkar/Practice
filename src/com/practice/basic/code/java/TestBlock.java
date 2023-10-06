package com.practice.basic.code.java;

public class TestBlock {
	
		static
		{
			System.out.println("inside static block-11 !!!");
		}
		public TestBlock()
		{
			System.out.println("inside TestBlock() no-arg constructor !!");
		}
		{
			System.out.println("inside instance block-11!!!");
		}
		static 
		{
			System.out.println("inside static block-22!!!");
		}
		{
			System.out.println("inside instance block-22!!!");
		}
		public static void printHello()
		{
			System.out.println("inside printHello()");
		}
		public void printHii()
		{
			System.out.println("inside printHii()");
		}
		public static void main (String[] args)
		{
			System.out.println("inside main method !!!");
			
			TestBlock obj1 = new TestBlock();

			obj1.printHii();
			
			printHello();
		}
		
	}