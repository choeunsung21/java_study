package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Smartphone;

public class Run {

	public static void main(String[] args) {
		// 객체 생성
		// 인스턴스화
		Smartphone myPhone = new Smartphone();

		// 1. 반환형 x, 매개변수 x
		myPhone.openApp();

		// 2. 반환형 o, 매개변수 x
		int battery = myPhone.checkBattery();
		System.out.println(battery + " " + myPhone.checkBattery());

		// 3. 반환형x, 매개변수o
		myPhone.setVolume(15);

		// 4. 반환형o, 매개변수o
		String result = myPhone.sendMsg("자니?");
		System.out.println(result);
	}

}
