package com.gn.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		email = email.trim();
		String domain = "@goodee.co.kr";
		if (!(email.contains(domain))) {
			System.out.println("유효하지 않은 이메일입니다.");
		} else {
			String id = email.substring(0, email.lastIndexOf("@"));
			String upperId = id.toUpperCase();
			System.out.println(upperId);
		}
	}

}
