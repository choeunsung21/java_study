package com.gn.practice06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub\\practice");
		if (!dir.exists())
			dir.mkdirs();
		File file = new File(dir, "output.txt");

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			String[] lines = {"첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다"};

			for (String str : lines) {
				bw.write(str);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
