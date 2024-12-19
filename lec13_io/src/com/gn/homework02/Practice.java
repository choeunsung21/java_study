package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {
	public long method1(String path) {
		long start = System.nanoTime();

		File file = new File(path, "나비야1.dat");
		try (FileInputStream fis = new FileInputStream(file)) {
			byte[] arr = new byte[(int) file.length()];
			int idx = 0;
			int data;
			while (true) {
				data = fis.read();
				if (data == -1) {
					break;
				}
				arr[idx++] = (byte) data;
			}
			String str = new String(arr);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

		long end = System.nanoTime();
		return end - start;

	}

	public long method2(String path) {
		long start = System.nanoTime();

		File file = new File(path, "나비야2.dat");
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
			byte[] arr = new byte[(int) file.length()];
			int idx = 0;
			int data;
			while (true) {
				data = bis.read();
				if (data == -1) {
					break;
				}
				arr[idx++] = (byte) data;
			}
			String str = new String(arr);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

		long end = System.nanoTime();
		return end - start;

	}
}
