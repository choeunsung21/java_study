package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		System.out.println("덧셈 : "+(num1+num2));
		System.out.println("뺄셈 : "+(num1-num2));
		System.out.println("곱셈 : "+(num1*num2));
		System.out.println("몫 : "+(num1/num2));
		System.out.println("나머지 : "+(num1%num2));
		

	}

}
