package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

public class PrimeChecker {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Prime {
	public void checkPrime(int... num) {
		for (int a : num) {
			if (isPrime(a)) {
				System.out.print(a + " ");
			}
		}
		System.out.println();

	}

	public boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		}

		int sqrt = (int) Math.sqrt(n);
		for (int i = 3; i <= sqrt; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
