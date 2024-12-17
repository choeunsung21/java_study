package com.gn.practice09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		Calendar newYear = Calendar.getInstance();
		newYear.set(2024, 1 - 1, 1);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis() - newYear.getTimeInMillis();
		diff /= 1000;
		long days = diff / (24 * 60 * 60);
		System.out.println(days);

		// 최대값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날짜 : " + last);

		// Date 써보기
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		String printDate = sdf.format(d);
		System.out.println(printDate);

		Calendar cal7 = Calendar.getInstance();
//		cal7.add(Calendar.YEAR, 1);
		Date date = cal7.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd a KK:mm");
		sdf2 = new SimpleDateFormat("yyyy-MM-dd a KK:mm:ss");
		System.out.println(sdf2.format(date));
	}

}
