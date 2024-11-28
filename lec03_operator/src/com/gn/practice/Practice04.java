package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {

		// 철수가 여권을 만드려고 함.
		// 영어 이름 : Chulsu
		// 20대인가?
		// 1. 철수의 영어 이름과 나이 정보를 입력 받음
		// 2. 3가지 논리형 데이터 출력
		// 3. (1) 영어 이름이 일치? ture
		// (2) 20대? false
		// (3) 영어 이름이 일치하면서 20대? false

		Scanner sc = new Scanner(System.in);

//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		String name1 = "Chulsu";
//		System.out.println("이름이 일치하나요? " + (name.equals(name1)));
//		System.out.println("20대인가요? " + (20 <= age && age < 30));
//		System.out.println("영어 이름이 일치하면서 동시에 20대인가요? " + ((name == name1) && (age >= 20 && age < 30)));

		System.out.println();

		System.out.print("이름 확인 : ");
		String whatName = sc.nextLine();
		String name = "Chulsu";
		System.out.print((name.equals(whatName) + ", " + name + "\n"));
		System.out.print("나이 확인 : ");
		int yourAge = sc.nextInt();
		int age = 23;
		System.out.println((29 >= yourAge && yourAge > 19) + ", " + "23");

	}

}
