package com.gn.practice01.run;

import com.gn.practice01.model.vo.Employee;
import com.gn.practice01.model.vo.Person;
import com.gn.practice01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Person[] arr = new Person[2];
		Employee emp = new Employee();
		Student std = new Student();

		arr[0] = std;
		arr[1] = emp;

		for (Person p : arr) {
			p.introduce();
		}
	}
}
