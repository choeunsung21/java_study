package com.gn.study.model.vo;

public class Product {

	private String name;
	private int price;

	public Product() {
		super();
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int compareTo(Product other) {
//		if(this.price>other.price) {
//			return 1;
//		} else if(this.price<other.price) {
//			return -1;
//		}else {
//			return 0;
//		}
//		return this.price-other.price;
		return this.name.compareTo(other.name);

	}

	@Override
	public String toString() {
		return name + ":" + price + "원";
	}
}
