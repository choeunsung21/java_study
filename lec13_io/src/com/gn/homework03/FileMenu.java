package com.gn.homework03;

import java.util.Scanner;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if (menu == 9) {
				break;
			}
		}
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장 할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String input = sc.nextLine();
			if (input.equals("ex끝it")) {
				break;
			}
			sb.append(input);
		}
		System.out.print("저장 할 파일명을 입력해주세요(ex. myFile.txt) : ");
		String file = sc.nextLine();
		fc.fileSave(file, sb);
	}

	public void fileOpen() {

	}

	public void fileEdit() {

	}
}
