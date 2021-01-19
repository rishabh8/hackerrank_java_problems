package com;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalProgram {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
//      	sc.close();

		Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
			@Override
			public int compare(String a1, String a2) {
				if(a1 == null || a2 == null)
					return 0;
				
				BigDecimal a = new BigDecimal(a1);
				BigDecimal b = new BigDecimal(a2);
				return a.compareTo(b);
			}
		}));
		
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
