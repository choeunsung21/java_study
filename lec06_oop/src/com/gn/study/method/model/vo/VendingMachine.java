package com.gn.study.method.model.vo;

public class VendingMachine {

	// 1. 인사
	public void sayHi() {
		System.out.println("환영합니다");
	}

	// 2. 남아있는 잔돈 리턴(기본형)
	public int getBalance() {
		int balance = 500;
		return balance;
	}

	// 3. 음료수 종류 리턴(배열)
	public String[] sodaList() {
		String[] arr = new String[] { "콜라", "사이다", "오렌지주스" };
		return arr;
	}

	// 4. 선택된 음료수 객체 리턴(클래스)
	public Soda selectedSoda() {
		Soda s1 = new Soda();
		return s1;
	}

}