package com.gn.homework03.controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
	}

	public int countAlpha(String s) throws CharCheckException {
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}

		int count = 0;
		for (char c : s.toCharArray()) {
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				count++;
			}
		}

		return count;
	}
}
