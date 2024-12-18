package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy\\MM\\dd");
		File dir = new File("C:\\test\\sub\\" + date.format(dtf));

		if (!dir.exists()) {
			if (dir.mkdirs()) {
				System.out.println("디렉토리 생성 성공");
			} else {
				System.out.println("디렉토리 생성 실패");
			}
		} else {
			System.out.println("이미 존재하는 디렉토리");
		}

		Practice p = new Practice();
		File dir2 = new File("C:\\test\\sub");
		p.deleteFile(dir2);
	}
}
