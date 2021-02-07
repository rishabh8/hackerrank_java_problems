package com;

import java.util.Scanner;

public class ADigitalQ1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            str = str.replaceAll("56", "").replaceAll("7", "");
            System.out.println(str);
        }
    }
}
