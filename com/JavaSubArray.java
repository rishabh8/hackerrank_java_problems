package com;

import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int total = 0;
            int sum;
            // For each starting position
            for (int i = 0; i < n; i++) {
                sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum < 0) {
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
    }

}
