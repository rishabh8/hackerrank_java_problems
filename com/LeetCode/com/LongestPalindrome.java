package com.LeetCode.com;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(longestPalindrome(str));
        }
    }

    // public static String longestPalindrome(String s) {
    // int n = s.length();
    // int maxLength = 0;
    // int start = 0;

    // for (int i = 0; i < n; i++) {
    // for (int j = i; i < n; j++) {
    // int flag = 1;

    // for (int k = 0; k < (j - i + 1) / 2; k++) {
    // if (s.charAt(i + k) != s.charAt(j - k)) {
    // flag = 0;
    // }
    // }

    // if (flag != 0 && (j - i - 1) > maxLength) {
    // start = i;
    // maxLength = j - i + 1;
    // }
    // }
    // }

    // return s.substring(start, start + n);
    // }

    // Dynamic Programming
    public static String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;

        int len = s.length(), longestPalindromeStart = 0, longestPalindromeLength = 1;
        boolean[][] state = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            state[i][i] = true;
        }

        for (int i = len - 1; i >= 0; i--) {
            for (int dist = 1; dist < len - i; dist++) {
                int j = dist + i;
                state[i][j] = (dist == 1) ? s.charAt(i) == s.charAt(j)
                        : (s.charAt(i) == s.charAt(j)) && state[i + 1][j - 1];
                if (state[i][j] && j - i + 1 > longestPalindromeLength) {
                    longestPalindromeLength = j - i + 1;
                    longestPalindromeStart = i;
                }
            }
        }

        return s.substring(longestPalindromeStart, longestPalindromeStart + longestPalindromeLength);
    }
}
