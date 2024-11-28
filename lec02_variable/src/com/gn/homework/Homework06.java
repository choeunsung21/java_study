package com.gn.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요 : ");
		int n = (sc.nextLine().charAt(0)) - '0';
		int square = n * n;
		System.out.print(square);
		

	}

}
