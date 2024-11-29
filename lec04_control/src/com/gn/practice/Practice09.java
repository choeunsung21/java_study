package com.gn.practice;

public class Practice09 {

	public static void main(String[] args) {

		int i = 1;
		while (true) {
			System.out.printf("반복 횟수 : %d\n", i);
			i++;
			if (i == 6) {
				break;
			}
		}
		System.out.println("반복 종료!");

	}

}
