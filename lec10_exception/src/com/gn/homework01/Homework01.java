package com.gn.homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		int random = (int) ((Math.random() * 50) + 1);
		int n = 0;
		int cnt = 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("1~50사이의 숫자 : ");
				n = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요");
				continue;
			}
			if (n < random) {
				System.out.println("Up!");
			} else if (n > random) {
				System.out.println("Down!");
			} else if (n == random) {
				System.out.println("축하합니다~ 정답이에요");
				System.out.println("시도 횟수 : " + cnt);
				break;
			}
			cnt++;
		}
		sc.close();
	}
}
