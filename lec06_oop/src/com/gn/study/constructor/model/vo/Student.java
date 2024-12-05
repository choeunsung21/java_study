package com.gn.study.constructor.model.vo;

public class Student {
	// 학생 번호 조회
	public void printInfo(int num) {
		System.out.println("당신의 번호는 " + num + "입니다");
	}

	// 학생 이름 조회
	public void printInfo(String name) {
		System.out.println("당신의 이름은 " + name + "입니다");
	}

	// 학생 번호, 이름 조회
	public void printInfo(int num, String name) {
		System.out.println(name + "님의 학번은 " + num + "입니다");
	}

	// 이름, 번호 조회
	public void printInfo(String name, int num) {
	}

	// --------------------------------

	// 오버로딩 찾기
//	public void test(int i){};
//	
//	public void test(String str){};				// 1번
//	public void test(int i, String str){};		// 2번
//	public void test(int num){};                // 3번
//	public char test(int point){};              // 4번
//	public void test(int i, int k){};           // 5번
//	public void test(int num, String string){}; // 6번
//	public void test(String str, int i){};      // 7번
}
