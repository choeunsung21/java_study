package com.gn.homework01.run;

import com.gn.homework01.model.vo.Employee;
import com.gn.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] std = { new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과"),
				new Student("이영희", 23, 167.0, 54.0, 4, "물리학과"), new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과") };

		for (Student student : std) {
			System.out.println(student);
		}

		System.out.println("===사원 입력받기===");
		Employee[] emp = new Employee[10];
//		Scanner
//		info~info
//		continue?
//				do while

	}

}
