package com.gn.practice05;

public class Run {

	public static void main(String[] args) {
		String[] words = { "java", "application", "programming", "interface" };
		String strWords = String.join(" ", words);
		// join은 데이터들 사이에만 값을넣고 양끝엔 들어가지않음. 그러므로 trim이 필요없음.
//		String newStrWords = strWords.trim();
		System.out.println(strWords);
//		String[] NewStrWords = strWords.split(" ");
		String api = "";
		// join은 기존 데이터를 변환시키지 않기때문에 배열을 새로 나눌필요가 없음.
		for (int i = 1; i < words.length; i++) {
			api += words[i].charAt(0);
		}
		api = api.toUpperCase();
		System.out.println(api);
	}
}
