package com.Interview_Question;

import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class MyClass {
    public static Map<String, Integer> processData(ArrayList<String> array) {
        String str[];
        int count = 0;
        Map<String, Integer> res = new HashMap<String, Integer>();
        int ar[] = new int[100];
        int ar1[] = new int[100];
        int s1 = 0, s2 = 0;
        for (String s : array) {
            str = s.split(",");
            if (str[2].trim().equals("Engineering")) {
                ar[count] = (int) Integer.parseInt(str[3].trim());
                if (s1 <= ar[count])
                    s1 = ar[count];
            }
            if (str[2].trim().equals("Testing")) {
                ar1[count] = (int) Integer.parseInt(str[3].trim());
                // Similarly Searching for the highest ID in the ar1(Array)
                if (s2 <= ar1[count])
                    s2 = ar1[count];
            }
        }
        for (String s : array) {
            str = s.split(",");
            if (s1 == (int) Integer.parseInt(str[0].trim())) {

                Integer i = (Integer) Integer.parseInt(str[0].trim());
                res.put("Engineering", i);

            }
            if (s2 == (int) Integer.parseInt(str[0].trim())) {
                Integer i = (Integer) Integer.parseInt(str[0].trim());
                res.put("Testing", i);

            }
        }

        return res;
    }

    // public static Map<String, Integer> processData(ArrayList<String> array) {
    // ArrayList<Employee> employees = new ArrayList<>();

    // array.forEach(empString -> {
    // String s[] = empString.split(",");
    // Employee emp = new Employee(Integer.parseInt(s[0].trim()),
    // Integer.parseInt(s[3].trim()), s[1], s[2]);
    // employees.add(emp);
    // });

    // Map<String, Employee> retVal = employees.stream()
    // .collect(groupingBy(
    // e -> e.getDepartment(),
    // collectingAndThen(maxBy(comparingInt(e -> e.getEmployeeId())),
    // Optional::get)));

    // Map<String, Integer> map = new HashMap<>();
    // retVal.entrySet().forEach(stringEmployeeEntry -> {
    // map.put(stringEmployeeEntry.getKey(),
    // stringEmployeeEntry.getValue().getSalary());
    // });
    // return map;
    // }

    public static void main(String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(
                    new BufferedReader(new FileReader("E:\\Java\\Sample\\com\\Interview_Question\\input.txt")));
            while (in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String, Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(
                    new BufferedWriter(new FileWriter("E:\\Java\\Sample\\com\\Interview_Question\\output.txt")));
            for (Map.Entry<String, Integer> e : retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}