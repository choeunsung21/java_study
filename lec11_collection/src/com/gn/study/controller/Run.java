package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// Boxing
		Integer iNum = 100;
		// Unboxing
		int num = iNum;
		// parse메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1 + str2);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1 + num2);

		str2 = "1.34";
		System.out.println(str2 + str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3 + num3);

		// NumberFormatException
		try {
			String[] arr = new String[3];
			arr[0] = "일";
			int arrNum = Integer.parseInt(arr[0]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열");

		// ClassCastException
		try {
			Object o = 9;
			String oStr = (String) o;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환");

		System.out.println();
		System.out.println("=========================");
		System.out.println();

		// 제네릭
		Container<Integer> con = new Container<Integer>();
		con.setItem(50);

		Container<String> tain = new Container<String>();
		tain.setItem("안녕");

		// List(ArrayList)
		// 1. 선언과 생성
		List<String> list = new ArrayList<String>();

		// 2. 추가
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal);

		meal.add(1, "간식");
		System.out.println(meal);

		// 3. 삭제
		meal.remove(1);
		System.out.println(meal);

		meal.clear();
		System.out.println(meal);

		// 4. 요소 변경
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		nums.set(1, 500);
		System.out.println(nums);

		// 5. 요소 조회
		nums.get(0);
		System.out.println(nums.get(0));

		for (int i = 0; i < nums.size(); i++) {
			System.out.println(i + " : " + nums.get(i));
		}
		for (Integer n : nums) {
			System.out.println(n);
		}
		// ArrayList의 정렬
		System.out.println("정렬전 : " + nums);
		Collections.sort(nums);
		System.out.println("오름차순 : " + nums);
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("내림차순 : " + nums);

		// ArrayList<객체>
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("김철수", 50));

		System.out.println(students);

		if (students.contains(new Student("김철수", 50))) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		if (students.indexOf(new Student("김철수", 50)) != -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		students.add(new Student("이영희", 40));
		students.add(new Student("홍길동", 30));

		System.out.println("정렬 전 : " + students);
		Collections.sort(students);
		System.out.println("정렬 후 : " + students);

		System.out.println();
		System.out.println("==============HashSet===============");
		System.out.println();

		Set<String> city = new HashSet<String>();
		city.add("서울");
		city.add("부산");
		city.add("광명");
		System.out.println(city);
		// 중복 데이터 추가 시도
		city.add("서울");
		System.out.println(city);

		for (String str : city) {
			System.out.println(str);
			city.remove(str);
			if (city.size() == 0) {
				System.out.println("마지막!");
			}
		}

		// 삭제
		city.remove("서울");
		System.out.println("삭제 후 : " + city);
		city.clear();
		System.out.println("비우기 : " + city);

		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수", 30));
		set1.add(new Student("이영희", 40));
		set1.add(new Student("홍길동", 50));
		set1.add(new Student("김철수", 30));

		System.out.println(set1);

		set1.remove(new Student("김철수", 30));
		System.out.println("삭제 후 : " + set1);

	}
}