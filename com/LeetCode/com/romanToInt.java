package com.LeetCode.com;

import java.util.Map;
import java.util.Scanner;
import static java.util.Map.entry;

public class romanToInt {

    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            System.out.println(convertRomanToInt(str));
        }
    }

    private static Map<Character, Integer> map = Map.ofEntries(
         entry('I', 1),
         entry('V', 5),
         entry('X', 10),
         entry('L', 50),
         entry('C', 100),
         entry('D', 500),
         entry('M', 1000)
    );

    public static int convertRomanToInt(String s) {
        var size = s.length();
        int prev = 0;
        int sum = 0;
        for (int i=size-1; i>= 0; i--) {
            var str = s.charAt(i);
            int val = map.get(str);
            if (prev != 0 && prev > val) {
                sum -= val;
            } else {
                sum += val;
            }
            prev = val;
        }
        return sum;
    }



    // public static int convertRomanToInt(String s) {
    //     Dictionary<String, Integer> romans = new Hashtable<>();
    //     romans.put("I", 1);
    //     romans.put("V", 5);
    //     romans.put("X", 10);
    //     romans.put("L", 50);
    //     romans.put("C", 100);
    //     romans.put("D", 500);
    //     romans.put("M", 1000);

    //     int res = 0;

    //     for(int i=0;i<s.length();i++) {
            
    //     }

    //     for(int i=0;i<s.length()-1;i++) {
    //         if(i+1 < s.length() && romans.get(s.charAt(i)) < romans.get(s.charAt(i+1))) {
    //             res -= romans.get(s.charAt(i));
    //         } else {
    //             res += romans.get(s.charAt(i));
    //         }
    //     }
    //     return res;
    // }
}
