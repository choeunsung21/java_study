package com.gn.practice;

public class Practice01 {

	public static void main(String[] args) {

		String[] friends = { "박지영", "김태우", "이지훈", "최유진", "정승호" };

		String[] friend = new String[5];
		friend[0] = "박지영";
		friend[1] = "김태우";
		friend[2] = "이지훈";
		friend[3] = "최유진";
		friend[4] = "정승호";

		for (int i = 0; i < friends.length; i++) {
			if ((i + 1) % 2 == 0) {
				continue;
			}
			System.out.println((i + 1) + " " + friends[i]);
		}

	}

}
