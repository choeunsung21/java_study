package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();

		LoginManager lm = new LoginManager();
		try {
			lm.login(id, pwd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
