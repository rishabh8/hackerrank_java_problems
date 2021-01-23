package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalQ2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            List<Integer> arr =  new ArrayList<>();

            for(int i = 9;i>1;i--) {
                while(num % i == 0) {
                    arr.add(i);
                    num = num / i;
                }
            }
            if(num>10) {
                System.out.println("Not Possible");
                return;
            }
            for(int i = arr.size()-1;i>=0;i--) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();

        }
    }
}
