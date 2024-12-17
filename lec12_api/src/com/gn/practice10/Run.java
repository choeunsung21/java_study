package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		// 오늘 날짜를 기준으로 1주일 뒤에 날짜 정보를 출력
		// 00월 00일 0요일
		// 오늘 날짜 기준으로 1달 뒤에 날짜 정보를 출력
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH, 1);
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(d));
		cal.add(Calendar.WEEK_OF_MONTH, -1);
		cal.add(Calendar.MONTH, 1);
		Date day = cal.getTime();
		System.out.println(sdf.format(day));
	}

}
