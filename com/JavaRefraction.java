package com;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaRefraction {
	public static void main(String args[]) {
		try {
			Class student = Student.class;
	        Method[] methods = student.getDeclaredMethods();

	        ArrayList<String> methodList = new ArrayList<>();
	        for(Method m : methods){
	            methodList.add(m.getName());
	        }
	        Collections.sort(methodList);
	        for(String name: methodList){
	            System.out.println(name);
	        }
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
