package com.gn.homework08;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점이 있는 숫자 : ");
		double num = sc.nextDouble();
		System.out.print("10의 제곱수 : ");
		int square = sc.nextInt();
		double result = Math.round(num * Math.pow(10, square)) / Math.pow(10, square);
		System.out.println("반올림된 결과 : " + result);
	}

}
