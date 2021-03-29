package com.trz.datastructure;

public class IdenticalSub {
    public static void main(String[] args) {
        String str1 = "cdabkkcadkabkebfkabkskab";
        String str2 = "ab";
        int count = maxIdenticalSub(str1, str2);
        System.out.println(count);
    }

    public static int maxIdenticalSub(String mainStr, String subStr) {
        int count = 0; //Initialize count

        while (mainStr.contains(subStr)) {
            int index = mainStr.indexOf(subStr) + subStr.length();

            mainStr = mainStr.substring(index);

            count++;
        }

        return count;
    }
}
