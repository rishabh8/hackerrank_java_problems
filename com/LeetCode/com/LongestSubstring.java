package com.LeetCode.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            System.out.println(lengthOfLongestSubString(str));

        }
    }

    // public static int lengthOfLongestSubString(String s) {
    // if (s == null) {
    // return 0;
    // }
    // int max_length = 0, left = 0;
    // Set<Character> hash_set = new HashSet<Character>();

    // for (int right = 0; right < s.length(); right++) {
    // if (hash_set.contains(s.charAt(right))) {
    // if (max_length < hash_set.size())
    // max_length = hash_set.size();
    // hash_set.clear();
    // right = ++left;
    // }
    // hash_set.add(s.charAt(right));
    // }

    // if (max_length < hash_set.size())
    // max_length = hash_set.size();

    // return max_length;
    // }

    public static int lengthOfLongestSubString(String s) {
        int left = 0, right = 0, result = 0;
        Map<Character, Integer> hmap = new HashMap<>();

        while (right < s.length()) {
            if (hmap.containsKey(s.charAt(right))) {
                left = Math.max(left, hmap.get(s.charAt(right)) + 1);
                hmap.put(s.charAt(right), right);
            } else {
                hmap.put(s.charAt(right), right);
            }

            result = Math.max(result, right - left + 1);
            right += 1;
        }

        return result;
    }
}
