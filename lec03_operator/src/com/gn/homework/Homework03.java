package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수 : ");
		int friends = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int candies = sc.nextInt();

		int candiesPerFriend = candies / friends;

		int remainingCandies = candies % friends;

		System.out.println("1인당 사탕 개수 : " + candiesPerFriend + "개");
		System.out.println("남는 사탕 개수 : " + remainingCandies + "개");

	}

}
