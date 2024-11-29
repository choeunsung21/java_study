package com.gn.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double height = scan.nextInt();
		double length = scan.nextInt();
		double area = (height * length) / 2;
		System.out.println(area);

	}

}