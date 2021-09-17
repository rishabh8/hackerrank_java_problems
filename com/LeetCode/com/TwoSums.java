package com.LeetCode.com;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSums {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int[] nums = {2,7,11,15};
            int target = 9;
            int[] res = new TwoSums().twoSum(nums, target);
            for (int i : res) {
                System.out.println(i);
            }
        }
    }

    // public int[] twoSum(int[] numbers, int target) {
    //     int l = 0, h = numbers.length-1;
    //     while (l < h) {
    //         int sum = numbers[l] + numbers[h];
    //         if (sum==target) return new int[]{l, h};
    //         else if (sum<target) l++;
    //         else h--;
    //     }
    //     return null;
    // }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< numbers.length;i++) {
            if(map.containsKey(target-numbers[i])) {
                return new int[]{i, map.get(target - numbers[i])};
            }
            map.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }
}
