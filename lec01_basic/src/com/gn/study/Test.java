package com.gn.study;

public class Test {
	//메인 메소드
//	라인 주석
//	메소드 : 일꾼(블록사이)
//	블록 주석 여러 줄 주석 가능
	public static void main(String[] args) {
		System.out.println("HELLO");
		// 1. print -> 줄바꿈 x
		System.out.print("HELLO");
		System.out.print(123);
		// 2. println -> 줄바꿈 o
		System.out.println("HELLO");
		System.out.println(123);
		// 3. printf(표현식,데이터)
		// 이름 : 김철수, 나이 : 25, 키 : 179.8
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f\n",
				"김철수", 25, 179.83);
		
		// 이스케이프 문자
		// "안녕하세요."
		System.out.println("\"안녕하세요.\"");
		// hello, world 사이 줄바꿈
		System.out.println("hello\nworld");
	}

}
