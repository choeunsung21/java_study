package com.gn.study.practice07.model.vo;

import java.util.Objects;

public class Equipment {
	private String name;
	private int pricePerDay;

	public Equipment() {
		super();
	}

	public Equipment(String name, int pricePerDay) {
		super();
		this.name = name;
		this.pricePerDay = pricePerDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		return Objects.equals(name, other.name) && pricePerDay == other.pricePerDay;
	}

	@Override
	public String toString() {
		return "-" + name + " : " + pricePerDay + "원";
	}

}
