package com.gn.practice02;

public class Practice {
	public void printStrLength(String str) {
		try {
			str.length();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생 : " + e.getMessage());
		}
	}
}
