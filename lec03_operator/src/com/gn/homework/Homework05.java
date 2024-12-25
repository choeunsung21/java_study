package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		String idNumber = sc.nextLine();
		char code = idNumber.charAt(7);
		String gender = (code == '1' || code == '2' || code == '3' || code == '4')
				? ((code == '1' || code == '3') ? "남성" : "여성")
				: "잘못된 값";
		System.out.println("입력하신 주민번호는 " + gender + "입니다.");

	}

}
