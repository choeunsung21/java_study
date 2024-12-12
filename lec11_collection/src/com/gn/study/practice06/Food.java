package com.gn.study.practice06;

import java.util.Objects;

public class Food {
	private String name;
	private int price;

	public Food() {
		super();
	}

	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Food) {
			Food f = (Food) obj;
			if (this.name.equals(f.name) && this.price == f.price) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return name + ":" + price;
	}
}
