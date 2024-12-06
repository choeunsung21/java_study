package com.gn.practice03.model.vo;

public class Circle extends Point {
	private int radius;
	private static final double PI = 3.14;

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public void draw() {
		System.out.println("(x, y) : (" + getX() + ", " + getY() + ")");
		System.out.printf("면적 : %.1f\n", PI * radius * radius);
		System.out.printf("둘레 : %.1f\n", 2 * PI * radius);
	}
}
