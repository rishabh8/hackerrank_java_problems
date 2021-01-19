package com;

import java.util.Scanner;

public class Strings_Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int len_str = A.length() + B.length();
		int lex_str = A.compareTo(B);
		String lex_status;
		if(lex_str > 0) {
			lex_status = "Yes";
		} else {
			lex_status = "No";
		}
		
		String firstCharA = A.substring(0,1);
		String remCharA = A.substring(1, A.length());
		firstCharA = firstCharA.toUpperCase();
		A = firstCharA + remCharA;
		
		String firstCharB = B.substring(0,1);
		String remCharB = B.substring(1, B.length());
		firstCharB = firstCharB.toUpperCase();
		B = firstCharB + remCharB;
		
		String res = A + ' ' + B;
		System.out.println(len_str);
		System.out.println(lex_status);
		System.out.println(res);
		
	}
}
