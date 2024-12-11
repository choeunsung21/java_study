package com.gn.homework01;

import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		while (true) {
			System.out.println("선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void insertBook() {

	}

	public void selectList() {

	}

	public void searchBook() {

	}

	public void deleteBook() {

	}

	public void ascBook() {

	}
}
