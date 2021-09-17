package com.LeetCode.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestTime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] res = sc.nextLine().split(" ");
            int[] num = new int[res.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.valueOf(res[i]);
            }

            System.out.println(largestTimeFromDigits(num));
        }
    }

    public static String largestTimeFromDigits(int[] arr) {
        List<List<Integer>> permutations = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        dfs(arr, permutations, visited, new ArrayList<>());
        int hourRst = -1, minuteRst = -1;
        for (List<Integer> time : permutations) {
            int hour = getHour(time);
            int minute = getMinute(time);

            if ((hour > hourRst && minute != -1) || (hour == hourRst && minute > minuteRst)) {
                hourRst = hour;
                minuteRst = minute;
            }
        }
        
        return (hourRst != -1 && minuteRst != -1) ? String.format("%02d:%02d", hourRst, minuteRst) : "";
    }


    public static void dfs(int[] A, List<List<Integer>> permutations, boolean[] visited, List<Integer> list) {
        if (list.size() == A.length) {
            permutations.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            list.add(A[i]);
            dfs(A, permutations, visited,list);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }

    public static int getHour(List<Integer> time) {
        int hour = time.get(0) * 10 + time.get(1);
        if (hour >= 0 && hour <= 23) {
            return hour;
        } else {
            return -1;
        }
    }

    public static int getMinute(List<Integer> time) {
        int minutes = time.get(2) * 10 + time.get(3);
        if (minutes >= 0 && minutes <= 59) {
            return minutes;
        } else {
            return -1;
        }
    }
}
