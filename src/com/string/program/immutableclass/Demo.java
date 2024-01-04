package com.string.program.immutableclass;

import java.util.Arrays;

// interview Question  

public class Demo {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 5, 3, 6 };

		int[] merge = new int[arr1.length + arr2.length];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			merge[count++] = arr1[i];
		}
		int j = 0;
		for (int i = arr1.length; i < merge.length; i++) {
			merge[i] = arr2[j++];
		}

		for (int i = 0; i < merge.length; i++) {
			for (int k = i + 1; k < merge.length; k++) {
				if (merge[i] == merge[k])
					merge[k] = 0;
			}
		}
		int counter = 0;
		for (int i = 0; i < merge.length; i++) {
			if (merge[i] != 0)
				counter++;
		}
		int[] unique = new int[counter];
		int h = 0;
		for (int i = 0; i < merge.length; i++) {
			if (merge[i] != 0)
				unique[h++] = merge[i];
		}

		System.out.println(Arrays.toString(unique));
	}

}
