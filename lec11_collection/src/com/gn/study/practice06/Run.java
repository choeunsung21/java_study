package com.gn.study.practice06;

import java.util.HashSet;
import java.util.Set;

public class Run {

	public static void main(String[] args) {

		Set<Food> foods = new HashSet<Food>();
		foods.add(new Food("샐러드", 14000));
		foods.add(new Food("치킨", 23000));
		foods.add(new Food("치킨", 50000));

		foods.remove(new Food("치킨", 50000));
		System.out.println("5만원 치킨 취소 : " + foods);

		foods.clear();
		System.out.println("전체 주문 취소 : " + foods);

	}

}
