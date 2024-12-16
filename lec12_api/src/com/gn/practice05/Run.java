package com.gn.practice05;

public class Run {

	public static void main(String[] args) {
		String[] words = { "java", "application", "programming", "interface" };
		String strWords = String.join(" ", words);
		String newStrWords = strWords.trim();
		System.out.println(newStrWords);
		String[] splitNewStrWords = newStrWords.split(" ");
		String api = "";
		for (int i = 1; i < splitNewStrWords.length; i++) {
			api += splitNewStrWords[i].charAt(0);
		}
		api = api.toUpperCase();
		System.out.println(api);
	}
}
