package com.gn.practice01;

public class Run {

	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		int[] arr = new int[1000000];
		int[] dst = new int[arr.length / 2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.arraycopy(arr, 0, dst, 0, dst.length);

		for (int i = 0; i < dst.length; i++) {
			if (i % 10 == 9) {
				System.out.println(dst[i]);
			} else {
				System.out.print(dst[i] + ", ");
			}
		}

		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간: " + (after - before) + "ms");
	}
}
