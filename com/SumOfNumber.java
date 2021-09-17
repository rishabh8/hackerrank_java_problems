package com;

import java.util.Optional;

public class SumOfNumber {
    public static void main(String[] args) {
        // function();
        Optional<String> str = Optional.ofNullable(null);

        System.out.println(str.get());
        // int ans = fun(100, 2000);
        // System.out.println(ans);
    }

    static void function() {
        int i =0;
        int sum=0;
        while(i<100) {
            sum = sum + i;
            sum = i+sum;
            i+=1;
        }
        System.out.println(sum);
    }

    static int printTrib(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n== 3) {
            return 1;
        } else {
            return printTrib(n-1) + printTrib(n-2) + printTrib(n-3);
        }
    }

    static void print(int n) {
        for(int i =0;i<n;i++) {
            System.out.println(printTrib(i) + " ");
        }
    }

    static int fib(int n) {
        if(n<=1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    static int fun(int A, int B) {
        if(B ==0) {
            return A;
        } else {
            return fun(B, A % B);
        }
    }
}