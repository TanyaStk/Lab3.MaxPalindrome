package com.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            System.out.println("Enter text:");
            List<String> text = new ArrayList<>();
            String nextLine = scr.nextLine();
            while (!nextLine.isEmpty()) {
                text.add(nextLine);
                nextLine = scr.nextLine();
            }
            String palindromeOfMaxSize = findMaxPalindrome(text);
            System.out.println("Max palindrome is: " + palindromeOfMaxSize);
        }
    }

    static String findMaxPalindrome(List<String> text) {
        String maxPalindrome = "";
        int maxSizeOfPalindrome = 0;
        for (String line : text) {
            String[] words = line.split("[ .,]");
            for (String word : words) {
                if (isPalindrome(word) && word.length() > maxSizeOfPalindrome) {
                    maxPalindrome = word;
                    maxSizeOfPalindrome = word.length();
                }
            }
        }
        return maxPalindrome;
    }

    static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(
                new StringBuilder(word).reverse().toString());
    }
}
