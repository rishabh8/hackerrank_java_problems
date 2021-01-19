package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Allocation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            if (T <= 100) {
                while (T-- > 0) {
                    int N = sc.nextInt();
                    long B = sc.nextLong();
                    if (N <= 100 && B <= 100000) {
                        long[] arr = new long[N];
                        for (int i = 0; i < N; i++) {
                            arr[i] = sc.nextLong();
                        }
                        Arrays.sort(arr);
                        // Now Scan whole Array
                        int count = 0;
                        for (int i = 0; i < N; i++) {
                            // sum += arr[i];
                            // if(sum <= B) {
                            // count++;
                            // }
                            // else{
                            // sum -= arr[i];
                            // }
                            if (arr[i] <= B) {
                                count++;
                                B -= arr[i];
                            }
                        }
                        System.out.println(count);
                    }
                }
            }
        }

    }

}
