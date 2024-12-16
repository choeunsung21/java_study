package com.gn.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String born = sc.nextLine();
		char lastName = name.charAt(0);
		String year = born.substring(2, 4);
		String day = born.substring(6);
		name = name.substring(1);
		System.out.println("암호 : " + lastName + year + day + name);
	}

}
