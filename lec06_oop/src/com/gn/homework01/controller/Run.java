package com.gn.homework01.controller;

import com.gn.homework01.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee emp1 = new Employee("김철수", "교육운영팀");
		Employee emp2 = new Employee("이영희", "경영지원팀");

		System.out.println("이름   팀");
		System.out.println(emp1.name + " " + emp1.team);
		System.out.println(emp2.name + " " + emp2.team);
	}

}
