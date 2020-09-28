package com.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.project1.Main.findMaxPalindrome;
import static com.project1.Main.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @org.junit.jupiter.api.Test
    void testFindMaxPalindrome() {
        List<String> text = new ArrayList<>(
                Arrays.asList("detartrated,cat.madam", "rotor abcd", "1234"));
        String expected = "detartrated";
        String actual = findMaxPalindrome(text);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testMaxPalindromeIsEmptyString() {
        List<String> text = new ArrayList<>(
                Arrays.asList("detartra,cat.ma", "tor abcd", ""));
        String expected = "";
        String actual = findMaxPalindrome(text);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testIsEmptyStringPalindrome() {
        String emptyString = "";
        assertTrue(isPalindrome(emptyString));
    }

    @org.junit.jupiter.api.Test
    void testIsStringOfNumbersPalindrome() {
        String str = "123321";
        assertTrue(isPalindrome(str));
    }

    @org.junit.jupiter.api.Test
    void testIsStringNotPalindrome() {
        String str = "Friday";
        assertFalse(isPalindrome(str));
    }
}
