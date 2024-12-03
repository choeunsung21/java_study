package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {

		String[][] arr = { { "(0,0)", "(0,1)", "(0,2)" }, { "(1,0)", "(1,1)", "(1,2)" } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			if (i != arr.length - 1) {
				System.out.println();
			}

		}

	}

}
