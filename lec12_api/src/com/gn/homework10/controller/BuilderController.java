package com.gn.homework10.controller;

public class BuilderController {
	public BuilderController() {

	}

	public String afterReplace(String str) {
		return "띄어쓰기 제거 전 : " + str.toString() + "\n띄어쓰기 제거 후 : " + str.replace(" ", "").toString()
				+ "\n띄어쓰기 제거 후 글자 수 : " + str.replace(" ", "").length() + "\n대문자로 변환 : "
				+ str.replace(" ", "").toUpperCase();
	}

	public String firstCap(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}

	public int findChar(String input, char one) {
		int cnt = 0;
		for (int i = 0; i < input.length(); i++) {
			if (one == input.charAt(i)) {
				cnt++;
			}
		}
		return cnt;
	}
}
