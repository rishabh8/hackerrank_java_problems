package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            Map<String, Integer> phoneBook = new HashMap<>();
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String name = sc.nextLine();
                int phone = sc.nextInt();
                sc.nextLine();
                phoneBook.put(name, phone);
            }

            while(sc.hasNext()) {
                String s = sc.nextLine();
                if(phoneBook.containsKey(s)){
                    System.out.println(s + "=" + phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
    
}
