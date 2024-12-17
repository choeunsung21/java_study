package com.gn.practice07;

public class Run {

	public static void main(String[] args) {
		double dn = 5.13824;
//		double fst = Math.round(dn * Math.pow(10, 1)) / Math.pow(10, 1);
		double fst = Math.round(dn * 10.0) / 10.0;
		double snd = Math.round(dn * Math.pow(10, 2)) / Math.pow(10, 2);
		double trd = Math.round(dn * Math.pow(10, 3)) / Math.pow(10, 3);
		System.out.println("소수점 첫째자리까지 반올림 : " + fst);
		System.out.println("소수점 둘째자리까지 반올림 : " + snd);
		System.out.println("소수점 셋째자리까지 반올림 : " + trd);
	}
}
