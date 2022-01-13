package com.LeetCode.com;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();
            System.out.println(isPalindromeOptimized(num));
        }
    }

    public static boolean isPalindrome(int num) {
        int sum =0, temp=0, rem;
        if(num < 0) {
            return false;
        }
        rem = num;
        while(num>0) {
            temp = num % 10;
            sum = (sum*10) + temp;
            num /= 10;
        }
        if(rem == sum) {
            return true;
        }
        return false;
    }

    // Optimized Solution
    public static boolean isPalindromeOptimized(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int res = 0;
        while(x> res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (x == res || x == res / 10);
    }
}