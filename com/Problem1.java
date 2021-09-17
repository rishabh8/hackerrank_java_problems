package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int length = Problem1.pickingNumber(arr, size);
            System.out.println(length == 1 ? -1 : length);

        }
    }

    public static int pickingNumber(int arr[], int n) {
        HashSet<Integer> subArray = new HashSet<>();
        int i, j, Max = 1;
        int diff = 1;
        int maximumArr = 1;

        for (i = 0; i < n - 1; i++) {
            subArray.add(arr[i]);
            for (j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == 0 || Math.abs(arr[i] - arr[j]) == diff) {
                    if (!subArray.contains(arr[j])) {
                        // if (subArray.size() == 2) {
                        // break;
                        // } else {
                        subArray.add(arr[j]);
                        // }
                    }
                } else {
                    break;
                }
            }

            if (subArray.size() == 2) {
                Max = Math.max(Max, j + i);
                maximumArr++;
                subArray.clear();
            } else {
                subArray.clear();
            }
        }
        return Max;
    }
}
