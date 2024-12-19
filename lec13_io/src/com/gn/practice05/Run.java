package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\애국가1.dat");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(dir);
			byte[] arr = new byte[(int) dir.length()];
			int idx = 0;
			int data;
			while (true) {
				data = fis.read();
				if (data == -1)
					break;
				arr[idx++] = (byte) data;
			}
			String str = new String(arr);
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
