package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) : ");
		double weight = sc.nextDouble();
		System.out.print("키(m) : ");
		double height = sc.nextDouble();
		
		double BMI = weight/(height*height);
		
		System.out.printf("BMI 지수 : %.1f%n", BMI);
		

	}

}
