package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		Product pd1 = new Food("치킨", 20000, 3);
		Product pd2 = new Book("자바의 정석", 15000);
		System.out.println(pd1.getName() + "의 최종 가격 : " + pd1.calculatePrice());
		System.out.println(pd2.getName() + "의 최종 가격 : " + pd2.calculatePrice());
	}
}
