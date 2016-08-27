package Tut1;

import java.util.Scanner;

public class bububu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть перше слово");
		String str1 = new Scanner(System.in).next();
		System.out.println("¬вед≥ть друге слово");
		String str2 = new Scanner(System.in).next();
		int result = compareTo(str1, str2);
		System.out.println(str1.compareTo(str2));
		System.out.println(result);
	}

	public static int compareTo(String str1, String str2) {
		if (str1.length() == str2.length()) {
			int compareTo = sameLength(str1, str2);
			return compareTo;
		} else if (str1.length() < str2.length()) {
			int compareTo = str1Smaller(str1, str2);
			return compareTo;
		} else {
			int compareTo = str2Smaller(str1, str2);
			return compareTo;
		}
	}

	public static int sameLength(String str1, String str2) {
		String char1;
		String char2;
		for (int i = 0; i < str1.length(); i++) {
			char1 = str1.substring(i, i + 1);
			char2 = str2.substring(i, i + 1);
			if (!(char1.equals(char2))) {
				return char1.codePointAt(0) - char2.codePointAt(0);
			}
		}
		return 0;
	}

	public static int str1Smaller(String str1, String str2) {
		if ((str1.substring(0).equals(str2.substring(0, str1.length())))) {
			return str1.length() - str2.length();
		} else {
			int compareTo = sameLength(str1, str2);
			return compareTo;
		}
	}

	public static int str2Smaller(String str1, String str2) {
		if ((str2.substring(0).equals(str1.substring(0, str2.length())))) {
			return str1.length() - str2.length();
		} else {
			int compareTo = sameLength(str1, str2);
			return compareTo;
		}
	}
}