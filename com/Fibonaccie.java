package com;

import java.util.Scanner;

public class Fibonaccie {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long num = sc.nextLong();
            for (int i = 0; i < num; i++)
                System.out.print(fibo(i) + " ");

        }
    }

    public static long fib(long n) {
        if (n == 1 || n == 0)
            return n;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static long fibo(int n) {
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}