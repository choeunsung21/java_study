package com.gn.practice;

public class Practice04 {

	public static void main(String[] args) {

		int[] ages = { 20, 18, 22, 19, 21 };

		int max = ages[0];
		int min = ages[0];
		int maximum = ages[0];
		int minimum = ages[0];

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > max) {
				max = ages[i];
			}
		}
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < min) {
				min = ages[i];
			}
		}

		for (int i : ages) {
			if (i > maximum) {
				maximum = i;
			}
		}
		for (int i : ages) {
			if (i < minimum) {
				minimum = i;
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이 : " + max);
		System.out.println("가장 나이가 적은 학생의 나이 : " + min);
		System.out.println(maximum);
		System.out.println(minimum);
	}

}
