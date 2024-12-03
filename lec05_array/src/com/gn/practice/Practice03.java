package com.gn.practice;

public class Practice03 {

	public static void main(String[] args) {

		int checkStd = 0;
		int noCheckStd = 0;
		int[] attend = { 1, 1, 1, 1, 1, 0, 1, 0, 0, 1 };
		for (int check : attend) {
			if (check == 1) {
				checkStd += 1;
			}
		}
		for (int noCheck : attend) {
			if (noCheck == 0) {
				noCheckStd += 1;
			}
		}
		System.out.println("출석한 학생 수 : " + checkStd);
		System.out.println("결석한 학생 수 : " + noCheckStd);

	}

}
