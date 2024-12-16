package com.gn.homework02;

public class Practice {
	public void takeState(String str) {
		String[] splitStr = str.split(" ");

		if (splitStr.length > 1 && splitStr[1].substring(splitStr[1].length() - 1).equals("구")) {
			System.out.println(splitStr[1]);
		} else {
			System.out.println("null");
		}
	}
}
