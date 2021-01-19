package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            int Q = sc.nextInt();

            for (int i = 0; i < Q; i++) {
                String action = sc.next();
                if (action.equalsIgnoreCase("Insert")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    arr.add(x, y);
                } else {
                    int x = sc.nextInt();
                    arr.remove(x);
                }
            }
            arr.stream().forEach(e -> System.out.print(e + " "));
        }
    }
}
