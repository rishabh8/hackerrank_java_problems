package com.LeetCode.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ContainDuplicate3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] res = sc.nextLine().split(" ");
            int[] num = new int[res.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.valueOf(res[i]);
            }

            int k = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(containsNearbyAlmostDuplicate(num, k, t));

        }
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0)
            return false;
        Map<Long, Long> d = new HashMap<>();
        long w = (long) t + 1;
        for (int i = 0; i < nums.length; ++i) {
            long m = getID(nums[i], w);
            // check if bucket m is empty, each bucket may contain at most one element
            if (d.containsKey(m))
                return true;
            // check the neighbor buckets for almost duplicate
            if (d.containsKey(m - 1) && Math.abs(nums[i] - d.get(m - 1)) < w)
                return true;
            if (d.containsKey(m + 1) && Math.abs(nums[i] - d.get(m + 1)) < w)
                return true;
            // now bucket m is empty and no almost duplicate in neighbor buckets
            d.put(m, (long) nums[i]);
            if (i >= k)
                d.remove(getID(nums[i - k], w));
        }
        return false;
    }

    private static long getID(long x, long w) {
        return x < 0 ? x / w - 1 : x / w;
        // return x < 0 ? (x + 1) / w - 1 : x / w;
    }

}
