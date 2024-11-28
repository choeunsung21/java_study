package com.gn.study;

public class CompareOperator {

	public static void main(String[] args) {
		
		// 비교 연산자
		int num1 = 5;
		int num2 = 10;
		
		// 1. 등호
		System.out.println(num1==num2);
		boolean same = num1 == num2;
		
		// 2. 부등호
		boolean diff = num1 != num2;
		
		// 3. 크기비교
		boolean big = num1 > num2;
		boolean small = num1 < num2;
		
		// 4. 크거나 같다, 작거나 같다
		boolean bigSame = num1 >= num2;
		boolean smallSame = num1 <= num2;
		
		// 5. char와 비교 연산자
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1 < c2);
		System.out.println((int)c1 + " < " + (int)c2);
		

	}

}
