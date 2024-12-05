package com.gn.practice07.model.vo;

public class Supplement {
	private String name;
	private int dosage;
	private int price;

	public Supplement(String name, int dosage, int price) {
		this.name = name;
		this.dosage = dosage;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getDosage() {
		return dosage;
	}

	public int getPrice() {
		return price;
	}

}
