package com.gn.homework03;

public class FileController {
	private FileDAO fd = new FileDAO();

	public boolean checkName(String file) {
		return fd.checkName(file);

	}

	public void fileSave(String file, StringBuilder sb) {

	}

	public StringBuilder fileOpen(String file) {
		return null;

	}

	public void fileEdit(String file, StringBuilder sb) {

	}
}
