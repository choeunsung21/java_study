package com.gn.study.test;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Controller c = new Controller();

	public void insertItem() {
		System.out.println("입력 : ");
		String str = sc.nextLine();

		c.insertItme2(str);
	}
}
