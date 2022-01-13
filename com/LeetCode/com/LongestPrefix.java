package com.LeetCode.com;

import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] str = sc.nextLine().split(" ");
            System.out.println(longestCommonPrefix(str));
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            prefix = findCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public static String findCommonPrefix(String prefix, String str) {
        while (prefix.length() > 0 && !str.startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }
}
