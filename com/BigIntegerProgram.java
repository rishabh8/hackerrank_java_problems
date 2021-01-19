package com;

import java.util.*;
import java.math.*;

public class BigIntegerProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.next());
        BigInteger num2 = new BigInteger(sc.next());
        
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
        sc.close();
    }
}