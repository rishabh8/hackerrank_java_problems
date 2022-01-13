package com.LeetCode.com;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] strs = sc.nextLine().split(" ");
            int[] nums = new int[strs.length];
            for(int i=0;i<strs.length;i++) {
                nums[i] = Integer.parseInt(strs[i]);
            }
            System.out.println(removeDuplicates(nums));

        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int seqIndex = 0; // increasing sequance index
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[seqIndex]) {
                seqIndex += 1;
                nums[seqIndex] = nums[i];
            }
        }
        return seqIndex + 1; // arrays first index is 0, so we should add 1 to get an array length
    }


}
