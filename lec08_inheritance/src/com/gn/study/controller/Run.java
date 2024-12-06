package com.gn.study.controller;

import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Pizza;

public class Run {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();

//		Parents p = new Parents();
//		System.out.println(p.getA());
//		Child c = new Child();

		Juice j = new Juice("트로피칼", 500, "용과");
//		j.printInfo();
		j.juiceInfo();

		Pizza p = new Pizza();
		p.printReaction(); // 부모와 자식의 메소드의 이름이 같을경우
							// 호출시 자식 메소드를 우선으로 가져옴

		Flower f1 = new Flower("장미", "빨간색");
		Flower f2 = new Flower("장미", "빨간색");

		if (f1.equals(f2)) {
			System.out.println("똑같아요!");
		} else {
			System.out.println("X");
		}

		System.out.println(f1);
	}

}
