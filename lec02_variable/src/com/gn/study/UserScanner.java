package com.gn.study;

// 1. Scanner 불러오기
import java.util.Scanner;

public class UserScanner {

	public static void main(String[] args) {
		
		// 2. Scanner 이름짓기
		Scanner sc = new Scanner(System.in);
		
		// 정수 형태 데이터 입력받기
		System.out.print("점수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();
		
		// 3. 입력받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println(name);
		

	}

}
