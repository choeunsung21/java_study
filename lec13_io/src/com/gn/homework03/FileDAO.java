package com.gn.homework03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	File def = new File("C:\\test");

	public boolean checkName(String file) {
		File userFile = new File(def, file);
		if (userFile.exists()) {
			return true;
		}
		return false;
	}

	public void fileSave(String file, String s) {
		File userFile = new File(def, file);
		try (BufferedWriter bos = new BufferedWriter(new FileWriter(userFile))) {
			bos.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StringBuilder fileOpen(String file) {
		File userFile = new File(def, file);
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(userFile))) {
			String line = null;
			while (true) {
				line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line).append("\n");
				return sb;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}

	public void fileEdit(String file, String s) {

	}
}
