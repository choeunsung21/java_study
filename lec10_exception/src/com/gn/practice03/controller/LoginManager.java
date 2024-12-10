package com.gn.practice03.controller;

import com.gn.practice03.exeption.InvalidCredentialsException;

public class LoginManager {
	public void login(String id, String pwd) throws InvalidCredentialsException {
		if (isValidCredentials(id, pwd) == false) {
			throw new InvalidCredentialsException("로그인이 실패하였습니다.\n잘못된 아이디와 비밀번호입니다.");
		} else {
			System.out.println("성공적으로 로그인되었습니다");
		}
	}

	private boolean isValidCredentials(String id, String pwd) {
		if ("admin".equals(id) && "admin1234!".equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}
}
