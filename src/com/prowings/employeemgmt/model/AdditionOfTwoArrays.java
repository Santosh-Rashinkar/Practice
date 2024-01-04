package com.prowings.employeemgmt.model;

import java.util.Arrays;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = {1, 2, 3};
		int[] nums2 = {4, 5, 6, 7};
		
		
		int[] result = additionOfTwoArrays(nums1, nums2);
		
		System.out.println(Arrays.toString(result));
	}
	public static int[] additionOfTwoArrays(int[] nums1, int[] nums2) {
//		int size = nums1.length > nums2.length ? nums1.length : nums2.length;
		
	int size = 0;
		
		if(nums1.length > nums2.length)
			size = nums1.length;
		else
			size = nums2.length;
		
		int[] result = new int[size];
		
		
		for(int i=0; i<size; i++) {
			
//			int num1 = i < nums1.length ? nums1[i] : 0;
//			int num2 = i < nums2.length ? nums2[i] : 0;
			int num1 =0;
			if(i<nums1.length) 
			num1 =nums1[i];
			else
				num1 = 0;
		int num2 = 0;
		if(i<nums2.length) 
			num2 =nums2[i];
		else
				num2 = 0;
			
			result[i] = num1 + num2;
			
		}
		
		return result;
	}

}

