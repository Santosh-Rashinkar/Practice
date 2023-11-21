package com.string.program;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Reverse String using Buffer : " + ReverseString.reverseMyString("ABC"));
		System.out.println("Reverse String using char[] : " + ReverseString.reverseMyStringIs("ABC"));

	}

	public static String reverseMyString(String input) {

		System.out.println("input string is: " + input);

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		String s = new String(sb);
		return s;
	}

	public static String reverseMyStringIs(String myInput) {

		System.out.println("input string is: " + myInput);

		char[] data = myInput.toCharArray();

		int counter = 0;

		for (int i = myInput.length() - 1; i >= 0; i--) {

			data[counter++] = myInput.charAt(i);
		}
		return new String(data);
	}

}