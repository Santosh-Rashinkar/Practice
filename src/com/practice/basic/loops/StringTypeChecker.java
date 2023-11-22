package com.practice.basic.loops;

import java.util.Scanner;

public class StringTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.matches("[0-9]+")) {
            System.out.println("Numeric");
        } else if (input.matches("[a-zA-Z]+")) {
            System.out.println("Alphabetical");
        } else if (input.matches("[a-zA-Z0-9]+")) {
            System.out.println("Alphanumeric");
        } else {
            System.out.println("Contains special characters");
        }

        scanner.close();
    }
}

