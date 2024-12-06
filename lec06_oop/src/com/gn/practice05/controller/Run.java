package com.gn.practice05.controller;

import com.gn.practice05.model.vo.run.Book;

public class Run {
	public static void main(String[] args) {

		Book book1 = new Book();
		book1.information();

		Book book2 = new Book("홍길동전", 5000, "허균");
		book2.information();

		Book book3 = new Book("채소 과일 레시피", "터치아트", "박경희", 19300, 0.1);
		book3.information();
	}
}
