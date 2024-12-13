package com.gn.homework03;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
		while (true) {
			System.out.println("=====(주)가남에 오신것을 환영합니다.=====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");

			int selectedNumber = sc.nextInt();
			sc.nextLine();

			switch (selectedNumber) {
			case 1:
				joinMember();
				break;
			case 2:
				login();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void memberMenu() {
		while (true) {
			System.out.println("*****회원 메뉴*****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다");
			System.out.println("먼저 회원가입, 로그인을 해주세요");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");

			int selectedNumber = sc.nextInt();
			sc.nextLine();

			switch (selectedNumber) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}
	}

	public void joinMember() {
		while (true) {
			System.out.println("===1. 회원가입===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			Member member = new Member(pwd, name);
			if (mc.joinMember(id, member)) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}

		}
	}

	public void login() {
		while (true) {
			System.out.println("===2. 로그인===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = sc.nextLine();
			if (mc.login(id, pwd) != null) {
				Member member = new Member();
				System.out.println(member.getName() + "님, 환영합니다!");
				memberMenu();
				break;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void changePassword() {
		while (true) {
			System.out.println("=== 1. 비밀번호 바꾸기 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();
			if (mc.changePassword(id, oldPw, newPw)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changeName() {
		while (true) {
			System.out.println("=== 2. 이름 바꾸기 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = sc.nextLine();
			mc.login(id, pwd);
			System.out.println("현재 설정된 이름 : ");
			System.out.print("변경할 이름 : ");
			String newName = sc.nextLine();
		}
	}

	public void sameName() {
	}

}
