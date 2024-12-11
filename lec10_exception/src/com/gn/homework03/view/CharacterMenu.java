package com.gn.homework03.view;

import java.util.Scanner;

import com.gn.homework03.controller.CharacterController;
import com.gn.homework03.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String s = sc.nextLine();

		CharacterController controller = new CharacterController();
		try {
			int alphaCount = controller.countAlpha(s);
			System.out.println("'" + s + "'에 포함된 영문자 개수 : " + alphaCount);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
