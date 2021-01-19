package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_match {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int testcases = Integer.parseInt(in.nextLine());
		while (testcases-- > 0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			}catch(Exception ex) {
				System.out.println("Invalid");
			}
		}
	}
}
