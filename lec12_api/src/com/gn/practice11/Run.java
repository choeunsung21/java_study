package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘날짜 : " + today.format(dft1));

		LocalDate open = LocalDate.of(2024, 12, 25);
		long dDay = ChronoUnit.DAYS.between(today, open);
		System.out.println("영화 개봉까지 남은 날 : " + dDay);

		int day = open.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : " + getKoreanDayOfWeek(day));

		System.out.println("개봉일 : " + open.format(dft1));

	}

	public static String getKoreanDayOfWeek(int day) {

		switch (day) {
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";
		case 7:
			return "일요일";
		}
		return null;
	}
}
