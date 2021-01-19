package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_Q4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isaAnagram(String a, String b) {
//		Arrays.sort(a.toCharArray());
//		Arrays.sort(b.toCharArray());
//		return Arrays.equals(a.toLowerCase().toCharArray(), b.toLowerCase().toCharArray());

		char aa[] = a.toLowerCase().toCharArray();
		char bb[] = b.toLowerCase().toCharArray();
		if (a.length() != b.length()) {
			return false;
		} else {
			java.util.Arrays.sort(aa);
			java.util.Arrays.sort(bb);
			return java.util.Arrays.equals(aa, bb);
		}
	}

	private static boolean isAnagram(String a, String b) {
		if (a == null || b == null || a.equalsIgnoreCase("") || b.equalsIgnoreCase("")) {
			return false;
		}

		if (a.length() != b.length())
			return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		java.util.Map<Character, Integer> map = new java.util.HashMap<Character, Integer>();
		for (int i = 0; i < b.length(); i++) {
			char letter = b.charAt(i);
			if (!map.containsKey(letter)) {
				map.put(letter, 1);
			} else {
				map.put(letter, map.get(letter) + 1);
			}
		}

		for (int k = 0; k < a.length(); k++) {
			char letter = a.charAt(k);
			if (!map.containsKey(letter))
				return false;

			if (map.get(letter) == 0)
				return false;
			else
				map.put(letter, map.get(letter) - 1);
		}
		return true;
	}

//	private static String generateKey(String str) {
//		return str.chars().sorted().mapToObj(letter -> String.valueOf((char) letter)).collect(Collectors.joining());
//	}

}
