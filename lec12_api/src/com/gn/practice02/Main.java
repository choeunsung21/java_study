package com.gn.practice02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();

		long before = System.currentTimeMillis();
		if (str1.length() > str2.length() && str1.length() > str3.length()) {
			System.out.println(str1.concat(str1));
		} else if (str2.length() > str1.length() && str2.length() > str3.length()) {
			System.out.println(str2.concat(str2));
		} else if (str3.length() > str1.length() && str3.length() > str2.length()) {
			System.out.println(str3.concat(str3));
		} else {
			if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
				System.out.println(str1.concat(str1));
			} else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
				System.out.println(str2.concat(str2));
			} else {
				System.out.println(str3.concat(str3));
			}
		}
		sc.close();
		long after = System.currentTimeMillis();
		System.out.println(after - before + "ms");
	}
}
