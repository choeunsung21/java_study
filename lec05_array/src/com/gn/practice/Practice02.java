package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		// for each 사용
		Scanner sc = new Scanner(System.in);

		int[] n = {};

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		for (int number : n) {
			if (number > 50) {
				System.out.println(number);
			}
		}
	}

}
