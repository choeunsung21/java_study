package com.gn.practice;

//import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 : ");
//		int n =sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		int test = 0;
//
//		for (int i = 2; i <= 9; i++) {
//			if (test == 27) {
//				break;
//			}
//			System.out.printf("===%d단===\n", i);
//			for (int j = 1; j <= 9; j++) {
//				test = i * j;
//				System.out.printf("%dx%d=%d\n", i, j, (i * j));
//			}
//		}
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				if (result == 45) {
					System.out.println("계산 결과가 45입니다.");
					break;
				}
				System.out.printf("%d x %d = %d\n", i, j, result);
			}
			if (i * 9 == 45) {
				break;
			}
		}
	}

}
