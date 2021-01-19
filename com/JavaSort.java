package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Students> studentList = new ArrayList<Students>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Students st = new Students(id, fname, cgpa);
			studentList.add(st);
			testCases--;
		}

		Collections.sort(studentList,
				Comparator.comparing(Students::getCgpa).thenComparing(Students::getFname).thenComparing(Students::getId));

		for (Students st : studentList) {
			System.out.println(st.getFname());
		}

	}

}

class Students {
	private int id;
	private String fname;
	private double cgpa;

	public Students(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}