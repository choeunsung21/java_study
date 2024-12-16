package com.gn.practice03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] strArr = sentence.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요:");
		String str = sc.nextLine();
		boolean found = false;

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].contains(str)) {
				found = true;
				System.out.print(strArr[i]);
				if (i + 1 < strArr.length) {
					System.out.println(" 다음 단어: " + strArr[i + 1]);
				} else {
					System.out.println(" 마지막 단어입니다.");
				}
			}

		}
		if (!found) {
			System.out.println("존재하지 않는 단어입니다.");
		}
		sc.close();
	}

}
