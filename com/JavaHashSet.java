package com;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = sc.next();
                pair_right[i] = sc.next();
            }

            HashSet<String> pairs = new HashSet<>();

            for(int i=0;i<t;i++){
                pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
                System.out.println(pairs.size());
            }
        }
    }
}
