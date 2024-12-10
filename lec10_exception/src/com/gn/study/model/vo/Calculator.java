package com.gn.study.model.vo;

public class Calculator {
	public int divide(int a, int b) {
//		1. 모든 블록에 return
//		try {
//			return a / b;
//		} catch (ArithmeticException e) {
//			return -1;
//		}
//		2. 임의의 변수를 활용
		int answer = -1;
		try {
			answer = a / b;
		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e);
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인");
		return answer;
	}
}
