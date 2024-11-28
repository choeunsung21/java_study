package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char Letter = sc.next().charAt(0);
		
		System.out.println(Letter + "의 유니코드 : " + (int)Letter);

	}

}
