package com.gn.homework07;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * 100) - 1;
		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");
		int num = 0;
		int cnt = 1;

		while (true) {
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
			if (1 > num || num > 100) {
				System.out.println("1~100의 정수만 입력");
				cnt--;
			} else if (num > random) {
				System.out.println("DOWN !");
			} else if (num < random) {
				System.out.println("UP !");
			} else {
				System.out.println("정답입니다 !!");
				System.out.println(cnt + "회만에 맞추셨습니다.");
				break;
			}
			cnt++;
		}

	}

}
