package com.gn.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int i = sc.nextInt();

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

	}

}
