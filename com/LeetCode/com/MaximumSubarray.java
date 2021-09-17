package com.LeetCode.com;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] res = sc.nextLine().split(" ");
            int[] num = new int[res.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.valueOf(res[i]);
            }

            System.out.println(maxSubArray(num));
        }
    }

    public static int maxSubArray(int[] nums) {
        int max = 0, current = 0;
        max = nums[0];
        current = max;

        for (int i = 1; i < nums.length; i++) {
            current = Math.max((current + nums[i]), nums[i]);
            max = Math.max(current, max);
        }
        return max;
    }
}
