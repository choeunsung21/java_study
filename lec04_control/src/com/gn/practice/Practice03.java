package com.gn.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("성별(F/M) : ");
		char yourMale = sc.next().charAt(0);
		System.out.print("머리(cm) : ");
		int yourHairLength = sc.nextInt();
		char male = 'm';
		char maleL = 'M';
		char female = 'f';
		char femaleL = 'F';

		if (yourMale == male || yourMale == maleL) {
			if (yourHairLength <= 3) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else if (yourMale == female || yourMale == femaleL) {
			if (yourHairLength <= 7) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("입력 오류");
		}

	}

}
