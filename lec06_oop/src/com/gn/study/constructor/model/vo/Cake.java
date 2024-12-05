package com.gn.study.constructor.model.vo;

public class Cake {
	// 기본값 flavor = null;
	// 기본값 price = 0;

	// 명시적 초기화
	public String flavor = "Choco";

	public static int price = 27000;

	// 초기화 블록
	{
		flavor = "딸기";
	}
	static {
		price = 32000;
	}

	// 생성자로 초기화
	public Cake() {
		this.flavor = "녹차";
		// this.price = 40000;
	}

}
