package com.project1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            System.out.println("Enter text:");
            List<String> text = new ArrayList<>();
            String nextLine = scr.nextLine();
            if(nextLine.isEmpty()){
                throw new IOException();
            }
            while (!nextLine.isEmpty()) {
                text.add(nextLine);
                nextLine = scr.nextLine();
            }
            System.out.println("Max palindrome is: " + findMaxPalindrome(text));
        }
        catch(IOException ex){
            System.out.println("Empty string.");
        }
    }

    static String findMaxPalindrome(List<String> text) {
        String maxPalindrome = "";
        int maxSizeOfPalindrome = 0;
        for (String line : text) {
            StringTokenizer tokenizer = new StringTokenizer(line, " ,.");
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();
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
