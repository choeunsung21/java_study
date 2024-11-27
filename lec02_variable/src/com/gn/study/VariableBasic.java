package com.gn.study;

public class VariableBasic {

	public static void main(String[] args) {
		
		// 1. 변수 선언
		int number;
		// 2. 변수 초기화
		int age = 100;
		// 3. 변수 표준출력
		System.out.println(age);
		// 4. 변수의 재할당
		int score = 90;
		System.out.println("1 : "+ score);
		score = 95;
		System.out.println("2 : "+ score);
		// 5. 문자열 변수의 초기화
		String str1 = new String("감사");
		String str2 = "합니다.";
		System.out.println(str1+str2);
		// 6. 기본형과 문자열 비교
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1 == num2);
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		// 7. charAt()
		String word = "Hello";
		char first = word.charAt(0);
		System.out.println(first);
		
	}

}
