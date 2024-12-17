package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		// 오늘 날짜
		Date today = cal.getTime();
		SimpleDateFormat sdfToday = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + sdfToday.format(today));

		// 카페 오픈일까지 남은 날
		Calendar open = Calendar.getInstance();
		open.set(2025, 1 - 1, 24);
		long dDay = open.getTimeInMillis() - cal.getTimeInMillis();
		dDay /= 1000;
		dDay /= (24 * 60 * 60);
		System.out.println("카페 오픈일까지 남은 날 : " + dDay + "일");

		// 오픈달의 마지막 날
		int last = open.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : " + last + "일");

		// 카페 오픈 요일
		Date openDay = open.getTime();
		SimpleDateFormat sdfOpenDay = new SimpleDateFormat("E요일");
		System.out.println("카페 오픈일의 요일 : " + sdfOpenDay.format(openDay));

	}
}
