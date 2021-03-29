package com.trz.datastructure;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Hello, world.";

        System.out.println(reverseString(s, 5, 11));
    }

    public static String reverseString(String s, int start, int end) {
        char[] chars = s.toCharArray();
        int mid = start + (end - start + 1) / 2; // Mid index of sub string

        while (start < mid) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(chars);
    }
}
