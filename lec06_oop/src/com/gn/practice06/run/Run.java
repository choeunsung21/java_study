package com.gn.practice06.run;

import com.gn.practice06.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person person = new Person("user01", "1234", "김철수", 43, 'M', "010-111-1111", "kcs@gmail.com");
		System.out.println(person.information());
	}

}
