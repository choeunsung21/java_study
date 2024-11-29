package com.gn.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("최소값 입력 : ");
		int max = sc.nextInt();

		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			System.out.println(sum);
			if (sum >= max) {
				System.out.println("초과된 합 : " + sum);
				break;
			}
		}

	}

}
