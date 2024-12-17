package com.gn.study.controller;

public class MathRun {

	public static void main(String[] args) {
		// 1. abs() : 절대값
		int num = -37;
//		num = num < 0 ? -num : num;
		num = Math.abs(num);
		System.out.println(num);

		// 2. pow(a,b) : a의 b 제곱값 반환(double)
		double dNum = Math.pow(5, 4);
		int result = 1;
		for (int i = 1; i <= 4; i++) {
			result *= 5;
		}
		System.out.println(dNum);
		System.out.println(result);

		// 3. 반올림
		double pi = 3.141592653578;
		// (1) 원하는 자리수만큼 10의 지수 곱하기
		double multi = pi * Math.pow(10, 3);
		System.out.println(multi);
		// (2) 반올림 처리
		double half = Math.round(multi);
		System.out.println(half);
		// (3) 10의 지수 만큼 나누기
		double div = half / Math.pow(10, 3);
		System.out.println(div);
		System.out.println(3142 / 1000.0);

		// 정리
		double after = Math.round(pi * Math.pow(10, 2)) / Math.pow(10, 2);
		System.out.println(after);

		// 4. 올림
		double up = Math.ceil(pi);
		System.out.println(up);

		// 5. 내림
		double down = Math.floor(pi);
		System.out.println(down);

		// 주의사항
		System.out.println(Math.ceil(1 / 2.0));
		// 소수점 처리 가능
		System.out.println(Math.ceil(pi * Math.pow(10, 2)) / Math.pow(10, 2));

	}

}
