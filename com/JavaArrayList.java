package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<ArrayList<String>> arrList = new ArrayList<>(n);
            String s = sc.nextLine();

            for (int i = 0; i < n; i++) {
                s = sc.nextLine();
                arrList.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
            }

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x <= arrList.size() && y < arrList.get(x - 1).size() && y >= 0) {
                    System.out.println(arrList.get(x - 1).get(y));
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
