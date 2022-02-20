package com.Collection_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapping {
    public static void main(String[] args) {
        // List<Employee> employeeList = new ArrayList<Employee>();

        // employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011,
        // 25000.0));
        // employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And
        // Marketing", 2015, 13500.0));
        // employeeList.add(new Employee(133, "Martin Theron", 29, "Male",
        // "Infrastructure", 2012, 18000.0));
        // employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product
        // Development", 2014, 32500.0));
        // employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013,
        // 22700.0));

        // Optional<Employee> emp =
        // employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(6).findFirst();
        // // Optional<Employee> emp =
        // employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        // () -> {

        // // }))
        // System.out.println(emp.get());
        int[] arr = { 3, 1, 3, 3, 2 };
        int res = majorityElement(arr, arr.length);
        System.out.println(res);
        System.out.flush();
    }

    public static int majorityElement(int a[], int size)
    {
        var map = Stream.of(a)
                    .collect(Collectors.toMap(w -> w, w->1, Integer::sum));
        
        int max = map.values().stream()
                    .mapToInt(n -> n)
                    .max().orElse(Integer.MIN_VALUE);
                    
        map.entrySet().stream()
            .filter(e -> max == e.getValue())
            .forEach(System.out::println);
        
        return 0;
    }

}

class Employee implements Runnable {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }

    @Override
    public void run() {
        System.out.println("Sex in Town");
    }
}