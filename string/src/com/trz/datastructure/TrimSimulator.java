package com.trz.datastructure;

import org.junit.Test;

public class TrimSimulator {

    @Test
    public void testTrimString() {
        String s = "      abc   ";
        System.out.println("Trimmed string is:" + trimString(s));
    }

    public String trimString(String s) {
        int start = 0; // To store first encountered non space char.
        int end = s.length() - 1; // To store last encountered non space char.

        while (start < end && s.charAt(start) == ' ') {
            start++;
        }

        while (end > start && s.charAt(end) == ' ') {
            end--;
        }

        if (s.charAt(start) == ' ') {
            return "";
        }

        return s.substring(start, end + 1);
    }
}
