package com.gn.practice01;

import java.io.File;

public class Practice {
	public void deleteFile(File dir) {
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				f.delete();
				System.out.println(f.getName() + " 파일 삭제");
			}
		}
	}
}
