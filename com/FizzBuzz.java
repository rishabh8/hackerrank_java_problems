package com;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while(T-->0) {
                int N = sc.nextInt();
                for(int i=1;i<=N;i++) {
                    if(i%(3*5)==0) {
                        System.out.println("FizzBuzz");
                    } else if(i%5==0) {
                        System.out.println("Buzz");
                    } else if(i%3==0) {
                        System.out.println("Fizz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
