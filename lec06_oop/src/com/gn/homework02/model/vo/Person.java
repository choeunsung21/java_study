package com.gn.homework02.model.vo;

public class Person {

	private String name;
	private String addr;
	public String phoneNumber;
	public double height;
	public double weight;

	public Person(String phoneNumber, double height, double weight) {
		this.phoneNumber = phoneNumber;
		this.height = height;
		this.weight = weight;
	}

}
