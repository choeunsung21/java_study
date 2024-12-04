package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {

	public static void main(String[] args) {

		Car car = new Car();

		car.startEngine();

		System.out.println("기본 속도는 " + car.checkspeed() + "km/h 입니다");

		car.setSpeed(150);

		String answer = car.setDestination("부산");
		System.out.println(answer);

	}

}
