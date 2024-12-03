package com.gn.study;

public class DimensionalArray {

	public static void main(String[] args) {

		int score1 = 23;
		int score2 = 35;
		int score3 = 75;
		int score4 = 99;
		int score5 = 82;

		int[] scores = { 23, 84, 76, 32, 98 };

		// 1. 배열의 선언
		int[] intArr;
		String[] strArr;

		// 2. 배열의 생성
		int[] nums;
		nums = new int[4];

		int[] heights = new int[10];

		// 3. 배열의 길이(인덱스)
		System.out.println(heights.length);

		// 4. 배열의 초기화(default)
		System.out.println(heights[2]);

		// 5. 배열의 초기화(값 변경)
		// (1) 인덱스 활용
		int[] age1 = new int[3];
		age1[0] = 40;
		age1[1] = 20;
		age1[2] = 70;

		// (2) for문 : 규칙있을 때.
		int[] age2 = new int[3];
		for (int i = 0; i < age2.length; i++) {
			age2[i] = i + 10;
		}

		// (3) 선언과 동시에 초기화
		// 선언 -> 생성 -> 초기화
		int[] age3 = new int[] { 1, 2, 3, 4 };
		int[] age4 = { 5, 6, 7 };
		// 아래 방법 불가능!
		// int[] element;
		// element= {9,10,11};

		// 6. 배열의 저장과정
		// (1) 선언 : Stack에 score라는 이름의 저장공간 마련
		int[] score;
		// (2) 생성 : Heap에 기차가 생김, Stack에 기차의 주소값 저장
		score = new int[4];
		// (3) 초기화 : Heap의 값 변경
		score[0] = 90;

		// 7. 배열의 출력
		// (1) 인덱스를 이용한 출력
		System.out.println(age1[1]);

		// (2) 반복문을 이용한 출력
		String[] fruits = { "딸기", "체리", "포도" };
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}

		// 8. toCharArray
		String text = "Hello World";
		char[] charArr = text.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}

		// vs charAt(i)
		text = "안녕하세요";
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text);
		}

		// 9. for each문
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int num : numbers) {
			System.out.println(num);
		}

		// 10. 배열의 활용 (1) - 총합과 평균
		int[] sus = { 83, 90, 100, 100, 50 };
		double sum = 0;
		for (int su : sus) {
			sum += su;
		}
		double avg = sum / 5;
		System.out.println(sum);
		System.out.println(avg);

		// 11. 배열의 활용(2) - 최대값과 최소값
		int[] arr = { 8, 9, 10, 4, 2 };
		// 최대값
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("최대값 : " + max);

		// 최소값
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);

		// 12. 배열의 활용(3) : 오름차순, 내림차순
		int[] data = { 8, 4, 1, 3 };
		// 인덱스 기준 : 0번과 1번 비교 -> 4, 8, 1, 3
		// 인덱스 기준 : 0번과 2번 비교 -> 1, 8, 4, 3
		// 0번과 3번 비교 -> 1, 8, 4, 3
		// 1번과 2번 비교 -> 1, 4, 8, 3
		// 1번과 3번 비교 -> 1, 3, 8, 4
		// 2번과 3번 비교 -> 1, 3, 4, 8

		// 0 -> 1, 2, 3
		// 1 -> 2, 3
		// 2 -> 3

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				System.out.println(i + "" + j);
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		for (int d : data) {
			System.out.print(d + " ");
		}
		System.out.println(" ");
		// 1, 3, 4, 8
		// 0번, 1번 비교 : 3 1 4 8
		// 0번, 2번 비교 : 4 1 3 8
		// 0번, 3번 비교 : 8 1 3 4
		// 1번, 2번 비교 : 8 3 1 4
		// 1번, 3번 비교 : 8 4 1 3
		// 2번, 3번 비교 : 8 4 3 1
		int[] datadata = { 1, 3, 4, 8 };
		for (int i = 0; i < datadata.length - 1; i++) {
			for (int j = i + 1; j < datadata.length; j++) {
				if (datadata[i] < datadata[j]) {
					int temp = datadata[i];
					datadata[i] = datadata[j];
					datadata[j] = temp;
				}
			}
		}
		for (int dd : datadata) {
			System.out.print(dd + " ");
		}
		System.out.println("\n===배열 복사===");

		// 13. 배열의 복사
		// (1) 얕은 복사
		int[] arr1 = { 5, 6, 7, 8 };
		// int[] arr2 = arr1;
		// (2) 깊은 복사
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}

		arr2[3] = 1000;
		for (int num1 : arr1) {
			System.out.print(num1 + ", ");
		}
		System.out.println();
		for (int num2 : arr2) {
			System.out.print(num2 + ", ");
		}

		// Math.random() -> 1~100 사이의 정수 랜덤값 도출
		double basic = Math.random();
		System.out.println(basic);

		// 1. (최대값-최소값+1)만큼 곱하기
		double hunit = basic * (100 - 1 + 1);
		System.out.println(hunit);

		// 2. 형변환
		int casting = (int) hunit;
		System.out.println(casting);

		// 3. 최소값 더하기
		int add = casting + 1;
		System.out.println(add);

		// 10~20 사이의 정수 랜덤값
		int rnd = (int) (Math.random() * 11) + 10;
		System.out.println(rnd);

		// 1~45 사이의 정수 랜덤값
		int rnd2 = (int) (Math.random() * 45) + 1;
		System.out.println(rnd2);

	}

}
