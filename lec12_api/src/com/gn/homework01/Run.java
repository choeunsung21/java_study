package com.gn.homework01;

public class Run {

	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";

		String[] splitStr = str.split("\n");
		String str1 = splitStr[0];
		String str2 = splitStr[1];
		String str3 = splitStr[2];
		String[] splitStr1 = str1.split(",");
		String[] splitStr2 = str2.split(",");
		String[] splitStr3 = str3.split(",");
		String name1 = splitStr1[0];
		String name2 = splitStr2[0];
		String name3 = splitStr3[0];
		int age1 = Integer.parseInt(splitStr1[1]);
		int age2 = Integer.parseInt(splitStr2[1]);
		int age3 = Integer.parseInt(splitStr3[1]);
		String address1 = splitStr1[2];
		String address2 = splitStr2[2];
		String address3 = splitStr3[2];
		char gender1 = splitStr1[3].charAt(0);
		char gender2 = splitStr2[3].charAt(0);
		char gender3 = splitStr3[3].charAt(0);

		Person p1 = new Person(name1, age1, address1, gender1);
		Person p2 = new Person(name2, age2, address2, gender2);
		Person p3 = new Person(name3, age3, address3, gender3);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
