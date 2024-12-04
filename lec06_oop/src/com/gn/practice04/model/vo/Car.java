package com.gn.practice04.model.vo;

public class Car {

	public void startEngine() {
		System.out.println("자동차 시동이 켜졌습니다");
	}

	public int checkspeed() {
		return 50;
	}

	public void setSpeed(int setSpeed) {
		System.out.println("속도가 " + setSpeed + "km/h로 설정되었습니다");
	}

	public String setDestination(String Destination) {
		return "목적지가 설정되었습니다 : " + Destination;
	}

}
