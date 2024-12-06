package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		Circle[] cir = { new Circle(1, 2, 3), new Circle(3, 3, 4) };
		Rectangle[] rec = { new Rectangle(-1, -2, 5, 2), new Rectangle(-2, 5, 2, 8) };

		System.out.println("===circle===");
		for (Circle c : cir) {
			c.draw();
		}
		System.out.println("===rectangle===");
		for (Rectangle r : rec) {
			r.draw();
		}
	}
}
