package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int korean = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		System.out.print("영어 : ");
		int english = sc.nextInt();

		int total = korean + math + english;

		double average = total / 3.0;

		boolean canChangePhone = (korean >= 60 && math >= 60 && english >= 60 && average > 90) ? true : false;

		System.out.println("합계: " + total + "점");
		System.out.printf("평균: %.0f점\n", average);
		System.out.println(canChangePhone ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.");
	}

}
