package com;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaPriorityQueue {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double cgpa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public Student() {
		id = 0;
		name = "";
		cgpa = 0.0f;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	public int compareTo(Student student) {
		double diffCGPA = student.cgpa - this.cgpa;
		if (diffCGPA == 0D) {
			if (student.name.equals(this.name)) {
				return student.id - this.id;
			} else {
				return this.name.compareTo(student.name);
			}
		} else {
			return diffCGPA < 0 ? -1 : 1;
		}
	}

}

class Priorities {

	public List<Student> getStudents(List<String> events) {
		List<Student> stuList = new ArrayList<Student>();
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		for (String str : events) {
			if (!str.equalsIgnoreCase("SERVED")) {
				pq.add(getStringToObject(str));
			} else {
				pq.poll();
			}
		}
		while (pq.size() > 1) {
			System.out.println(pq.poll().getName());
		}
		stuList.addAll(pq);
		return stuList;
	}

	public Student getStringToObject(String str) {
		String[] strs = str.split(" ");
		int id = Integer.parseInt(strs[3]);
		String name = strs[1];
		double cgpa = Double.parseDouble(strs[2]);

		return new Student(id, name, cgpa);
	}

}
