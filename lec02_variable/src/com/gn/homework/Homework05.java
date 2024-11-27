package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int lang = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int score = lang+eng+math;
		int avg = score / 3;
		System.out.println("총점 : " + score);
		System.out.println("평균 : " + avg);

	}

}
