package com.gn.practice01;

public class Manager extends Employee {
	private String department;

	public Manager() {

	}

	public Manager(String name, String department) {
		super(name);
		this.department = department;
	}

	public void printDepartment() {
		System.out.println("담당 부서 : " + department);
	}
}