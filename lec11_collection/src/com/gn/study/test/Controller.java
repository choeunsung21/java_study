package com.gn.study.test;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<String> list = new ArrayList<String>();

	public void insertItme2(String item) {
		list.add(item);
		System.out.println(item);
	}
}
