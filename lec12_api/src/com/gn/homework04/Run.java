package com.gn.homework04;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		String upperStr = "";
		ArrayList<String> arrList = new ArrayList<String>();

		while (true) {
			System.out.print("문자열 : ");
			str = sc.nextLine();
			arrList.add(str);
			upperStr = str.toUpperCase();
			if (upperStr.equals("N")) {
				arrList.remove("n");
				arrList.remove("N");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.print("최종 문자열 : ");
		for (String i : arrList) {
			System.out.print(i);
		}
		sc.close();
	}
}
