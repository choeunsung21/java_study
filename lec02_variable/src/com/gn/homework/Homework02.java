package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double horizon = sc.nextDouble();
		System.out.print("세로 : ");
		double vertical = sc.nextDouble();
		
		double area = horizon*vertical;
		double perimeter = 2*(horizon+vertical);
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);

	}

}
