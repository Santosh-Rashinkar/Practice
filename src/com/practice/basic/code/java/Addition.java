package com.practice.basic.code.java;

public class Addition {

		public int additionOfNumber(int a,int b) {
			
			System.out.println("addition method started...!!");
			
			int c = a+b;
			
			System.out.println("addition is :" +c);
			
			System.out.println("addition method ended...!!");
			
			return c;
			
		}
		
		public static void main(String []args) {	
		
	    System.out.println("main method started...!!");
	    
	    Addition obj = new Addition();
	    
	    obj.additionOfNumber(50,60);
	    	
	    System.out.println("main method ended...!!");
			}
		}

