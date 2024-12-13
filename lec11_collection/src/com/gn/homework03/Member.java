package com.gn.homework03;

public class Member {
	private String password;
	private String name;

	public Member() {

	}

	public Member(String password, String name) {
		super();
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "비밀번호=" + password + ", 이름=" + name;
	}

}