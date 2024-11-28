package com.gn.study;

public class CompareOperator {

	public static void main(String[] args) {

		// 비교 연산자
		int num1 = 5;
		int num2 = 10;

		// 1. 등호
		System.out.println(num1 == num2);
		boolean same = num1 == num2;

		// 2. 부등호
		boolean diff = num1 != num2;

		// 3. 크기비교
		boolean big = num1 > num2;
		boolean small = num1 < num2;

		// 4. 크거나 같다, 작거나 같다
		boolean bigSame = num1 >= num2;
		boolean smallSame = num1 <= num2;

		// 5. char와 비교 연산자
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1 < c2);
		System.out.println((int) c1 + " < " + (int) c2);

		// 6. equals
		String str1 = "apple";
		String str2 = new String("apple");
		boolean bool = str1.equals(str2);
		System.out.println(bool);

		// 7. 논리 연산자
		int a = 6;
		int b = 5;
		int c = 7;

		// (1) AND : 6은 5보다 크고, 7보다 큰가?
		boolean andBool = a > b && a > c;
		System.out.println(andBool);

		// (2) OR : 6은 5보다 크고, 7보다 큰가?
		boolean orBool = a > b || a > c;
		System.out.println(orBool);

		// 8. 논리 부정 연산자
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println(isFalse);

		// 논리 연산자(&&, ||)와 함께 사용
		boolean test1 = 3 < 5;
		boolean test2 = 6 < 5;

		// true && false -> false -> true
		System.out.println(!(test1 && test2));

		// 9. 삼항 연산자
		int x = 5;
		int y = 10;

		boolean result = x > y;
		// x,y 중에 더 큰 값을 출력
		// 조건식 ? true일때 결과 : false일때 결과
		System.out.println(x > y ? x : y);

		int z = 3;
		// 3개의 정수 중 가장 큰 수 찾기
		int big1 = x > y ? (x > z ? x : z) : (y > z ? y : z);

	}

}
