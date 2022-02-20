package com.LeetCode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Interview1 {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        Map<Thread, StackTraceElement[]> m1 = Thread.getAllStackTraces();

        // String str1 = new String("hello");
        // String str2 = new String("welcome");
        // str1 = str1.concat("world");
        // // System.out.println(str1);
        // // System.out.print(str1.equals(str2));
        // // System.out.print(str1 == str2);
        // int i = 6;
        // int j = i++;
        // // System.out.println(i + " " + j);
        // short a, b, c;
        // a = 1;
        // b = 2;
        // // c = a + b;
        // Sample s = new Sample();
        // // s.display();
        // s = new Sample2();
        // ((Sample2) s).display();

        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        
        Object s1 = new Object();
        Object s2 = new Object();
        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, null);
        map.put(null, 3);
        map.put(null, 4);

        // System.out.println(map.compute(2, (k, v) -> v == null ? 0 : v));

        Predicate<Integer> predicate = i -> i%2==0;
        // System.out.println(predicate.test(2));

        Map m = Collections.synchronizedMap(new HashMap<>());


    }
}

class Sample {
    // public void display() {
    //     System.out.println("Hello World! Sample1");
    // }
}

class Sample2 extends Sample {
    public void display() {
        System.out.println("Hello world! Sample2");
    }
}
