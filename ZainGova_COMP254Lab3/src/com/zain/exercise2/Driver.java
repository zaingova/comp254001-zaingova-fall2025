package com.zain.exercise2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker (type 'quit' to exit)");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("\nEnter a string: ");
            String input = sc.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String cleaned = input.replaceAll("\\s+", "").toLowerCase();

            if (Algorithm.IsPalindrome(cleaned)) {
                System.out.println("'" + input + "'" + " is a palindrome.");
            } else {
                System.out.println("'" + input + "'" + " is not a palindrome.");
            }
        }
    }
}
