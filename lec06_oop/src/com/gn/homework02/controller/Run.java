package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		Person person1 = new Person("01012345678", 190.5, 100.2);
		Person person2 = new Person("01056434563", 175.4, 65.6);

		System.out.println("전화번호        키   몸무게");
		System.out.println(person1.phoneNumber + " " + person1.height + " " + person1.weight);
		System.out.println(person2.phoneNumber + " " + person2.height + " " + person2.weight);
	}

}
