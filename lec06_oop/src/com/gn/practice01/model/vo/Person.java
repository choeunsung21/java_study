package com.gn.practice01.model.vo;

public class Person {
	public int solution(int[] array) {
		int answer = 0;
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i + 1]) {
				int temp = min;
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		return answer;
	}

}
