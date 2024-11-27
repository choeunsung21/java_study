package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String strLetter = sc.next();
		char charLetter = strLetter.charAt(0);
		
		System.out.println(charLetter + "의 유니코드 : " + (int)charLetter);

	}

}
