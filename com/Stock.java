package com;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str[] = sc.nextLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // System.out.println(maximumProfit(arr, 0, arr.length - 1));
            System.out.println(maximumProfit(arr, arr.length));
        }
    }

    public static int maximumProfit(int[] price, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int currentProfit = price[j] - price[i] + maximumProfit(price, start, i - 1)
                            + maximumProfit(price, j + 1, end);
                    profit = Math.max(profit, currentProfit);
                }
            }
        }
        return profit;
    }

    public static int maximumProfit(int[] price, int len) {
        int maxprofit = 0;
        for (int i = 1; i < len; i++) {
            if (price[i] > price[i - 1]) {
                maxprofit += price[i] - price[i - 1];
            }
        }
        return maxprofit;
    }

}
