package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	public long method1(String song) {
		long start = System.nanoTime();
		File dir = new File("C:\\test\\sub");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "나비야1.dat");
		try (FileOutputStream fos = new FileOutputStream(file)) {
			byte[] arr = song.getBytes();
			fos.write(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		return end - start;

	}

	public long method2(String song) {
		long start = System.nanoTime();
		File dir = new File("C:\\test\\sub");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "나비야2.dat");
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
			byte[] arr = song.getBytes();
			bos.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		return end - start;

	}
}
