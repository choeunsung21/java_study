package com.gn.practice06;

public class Practice {

	public String practice() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		sb.append("!");
		sb.insert(0, "<<");
		sb.delete(10, 12 + 1);
		sb.reverse();
		return sb.toString();
	}
}
