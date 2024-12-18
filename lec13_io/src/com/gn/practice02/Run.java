package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run {

	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir, UUID.randomUUID().toString().replace("-", "") + ".txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
