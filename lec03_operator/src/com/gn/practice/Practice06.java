package com.gn.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("첫번째 : ");
//		int fst = sc.nextInt();
//		System.out.print("두번째 : ");
//		int snd = sc.nextInt();
//		System.out.println("두 수 중에서 작은 수는? " + (fst < snd ? fst : snd));

		System.out.print("정수 입력 : ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();

		System.out.print(i1 > i2 ? (i1 > i3 ? i1 : i3) : (i2 > i3 ? i2 : i3));

	}

}
