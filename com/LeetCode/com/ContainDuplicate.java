package com.LeetCode.com;

import java.util.HashMap;
import java.util.Scanner;

public class ContainDuplicate {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] res = sc.nextLine().split(" ");
            int[] num = new int[res.length];
            for(int i=0;i<num.length;i++) {
                num[i] = Integer.valueOf(res[i]);
            }

            System.out.println(containsDuplicate(num));
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean temp = false;
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                temp = true;
            }
            map.put(nums[i], i);
        }
        return temp;
    }
}
