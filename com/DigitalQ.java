package com;

import java.util.Arrays;
import java.util.Scanner;

public class DigitalQ {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n < 2) {
                System.out.println("Invalid Input");
                return;
            }
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == arr[0]){
                    count++;
                }
            }
            if(count == n){
                System.out.println("Equal");
                return;
            }
            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
