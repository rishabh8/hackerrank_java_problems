package com.Collection_Framework;

abstract class School {
    int i = 0;
    public School() {
        display();
        i=2;
    }
    abstract void myMethod();
    void display() {
        System.out.println(i);
    }
}

interface Student {
    abstract void myMethod();
}

class Teacher extends School implements Student {
    public Teacher() {
        super();
        i=1;
    }

    public void myMethod() {
        new Teacher();
    }
}

class Marks extends Teacher {
    public Marks() {
        i = 5;
        myMethod();
    }
}


public class Smaple {
    public static void main(String[] args) {
        Marks m = new Marks();
    }
}
