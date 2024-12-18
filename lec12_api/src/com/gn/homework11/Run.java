package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : " + start.format(dtf1));
		long sec = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력 : ");
			String yn = sc.next();
			String upperYn = yn.toUpperCase();
			char c = upperYn.charAt(0);
			if (c == 'Y' || c == 'N') {
				if (c == 'Y') {
					LocalTime end = LocalTime.now();
					sec = ChronoUnit.SECONDS.between(start, end);
					System.out.println("경과(초) : " + sec);
				} else {
					System.out.println("종료합니다.");
					break;
				}
			} else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
		sc.close();
	}
}
