package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {

	public void practice01() {

		System.out.println("===놀이동산 입장료 계산하기===");

		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();

		if (age < 0) {
			System.out.println("나이 입력 오류");
		} else if (age < 3) {
			System.out.println("놀이동산 요금은 무료입니다.");
		} else if (age <= 12) {
			System.out.println("놀이동산 요금은 10000원입니다.");
		} else if (age <= 18) {
			System.out.println("놀이동산 요금은 20000원입니다.");
		} else if (age <= 64) {
			System.out.println("놀이동산 요금은 30000원입니다.");
		} else {
			System.out.println("놀이동산 요금은 무료입니다.");
		}

		sc.close();
	}

	public void practice02() {

		System.out.println("일기예보");

		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temper = sc.nextInt();

		if (12 < month || month < 1) {
			System.out.println("입력 오류");
		} else if (3 <= month && month <= 5) {
			System.out.print("봄");
		} else if (6 <= month && month <= 8) {
			System.out.print("여름");
			if (33 <= temper && temper < 35) {
				System.out.print(" 폭염 주의보");
			} else {
				System.out.print(" 폭염 경보");
			}
		} else if (9 <= month && month <= 11) {
			System.out.print("가을");
		} else if ((12 == month) || (1 <= month && month <= 2)) {
			System.out.print("겨울");
			if (temper <= -15) {
				System.out.println(" 한파 경보");
			} else {
				System.out.println(" 한파 주의보");
			}
		} else {
			System.out.println("오류");
		}
	}

	public void practice03() {
		System.out.println("=== 세개의 정수 비교하기===");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int n2 = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int n3 = sc.nextInt();
		int min = (n1 < n2) ? ((n1 < n3) ? n1 : n3) : ((n2 < n3) ? n2 : n3);
		{
			System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다");
		}
	}

	public void practice04() {
		System.out.println("===철수네 공장===");
		Scanner sc = new Scanner(System.in);
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		switch (code) {
		case 400:
			System.out.println("잘못된 요청입니다.");
			break;
		case 404:
			System.out.println("요청하신 서비스를 찾을 수 없습니다.");
			break;
		case 500:
			System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
			break;
		case 503:
			System.out.println("일시적인 서버 오류가 발생하였습니다.");
			break;
		default:
			System.out.println("알 수 없는 오류가 발생하였습니다.");
		}

	}

	public void practice05() {
		System.out.println("===헬스 마니아 철수===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		Scanner sc = new Scanner(System.in);
		int gungang = sc.nextInt();

		if (gungang > 5) {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		} else if (gungang == 1) {
			System.out.println("스쿼트 운동 시간입니다.");
		} else if (gungang == 2) {
			System.out.println("데드리프트 운동 시간입니다.");
		} else if (gungang == 3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		} else if (gungang == 4) {
			System.out.println("풀업 운동 시간입니다.");
		} else if (gungang == 5) {
			System.out.println("오늘도 수고하셨습니다.");
		} else {
			System.out.println("음수 또는 0 : 양수만 입력해주세요.");
		}
	}
}