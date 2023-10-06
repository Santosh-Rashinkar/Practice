package com.practice.basic.java;

import java.util.Scanner;

public class CalculateBoxVolume {
	
	public static int boxVolume(int length, int breadth,int height) {
		
		return length*breadth*height;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter length,breadth,height of box: ");
		
		Scanner scan = new Scanner(System.in);
		
		int length = scan.nextInt();
		
		int breadth = scan.nextInt();
		
		int height = scan.nextInt();
		
		int volume = boxVolume(length,breadth,height);
		
		System.out.println("volume of box is: "+volume);
		
		scan.close();
	
	}
}