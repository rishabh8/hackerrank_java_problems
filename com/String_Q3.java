package com;

import java.util.Scanner;

public class String_Q3 {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder str = new StringBuilder();
        str.append(A);
        str.reverse();
        String B = str.toString();
        if(B.compareTo(A) == 0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }

}
