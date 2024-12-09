package com.gn.homework02.run;

import com.gn.homework02.model.vo.Dish;
import com.gn.homework02.model.vo.Drink;
import com.gn.homework02.model.vo.Menu;

public class MenuManager {

	public static void main(String[] args) {
		Menu[] m = new Menu[5];

		int i = 0;
		while (i < m.length) {
			if (Math.random() > 0.5) {
				m[i] = new Dish();
			} else {
				m[i] = new Drink();
			}
			i++;
		}

		for (Menu mm : m) {
			mm.cook();
		}

	}

}
