package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] scores = { 54, 23 };
		int[] scores2 = new int[scores.length + 1];
		for (int i = 0; i < scores.length; i++) {
			scores2[i] = scores[i];
		}
		System.out.print("길동이 : ");
		scores2[scores.length] = sc.nextInt();
		for (int i : scores2) {
			System.out.println(i);
		}

		int score = 0;
		for (int i : scores2) {
			score += i;
		}
		int avg = score / 3;
		System.out.println("총합 : " + score);
		System.out.println("평균 : " + avg);

		sc.close();
	}

}
