package com.gn.study.method.model.vo;

public class Smartphone {

	// 1. 반환형 X, 매개변수 X
	// -> 앱 열림 메시지
	public void openApp() {
		System.out.println("앱이 열렸습니다");
	}

	// 2. 반환형 O, 매개변수 X
	// -> 배터리 잔량 리턴
	public int checkBattery() {
		return 85;
	}

	// 3. 반환형 x, 매개변수 o
	// -> 볼륨 입력하면 출력
	public void setVolume(int volume) {
		System.out.println("볼륨이 " + volume + "으로 설정되었습니다.");
	}

	// 4. 반환형 o, 매개변수 o
	// -> 메시지 전송
	public String sendMsg(String msg) {
		return "메시지 \'" + msg + "\'가 전송되었습니다";
	}
}
