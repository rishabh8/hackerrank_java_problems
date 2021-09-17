package com;

import java.util.Scanner;

public class Coprime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long M = sc.nextLong();

            if (isCoPrime(N, M)) {
                long res = gcd(N, M);
                long ans = (N/res) + (M/res);
                System.out.println(ans);
            }
        }
    }

    public static boolean isCoPrime(long a, long b) {
        long min, max, gcd = 1l;
        min = a;
        if (min > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }
        while (max > min) {
            long r = max % min;
            if (r == 0) {
                gcd = min;
                break;
            } else {
                max = min;
                min = r;
            }
        }
        if (gcd == 1) {
            return true;
        } else {
            return false;
        }
    }

    static long gcd(long a, long b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
}
