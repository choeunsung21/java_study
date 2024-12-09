package com.gn.practice02.run;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		SchoolMember[] arr = new SchoolMember[3];
		arr[0] = new Staff();
		arr[1] = new Student();
		arr[2] = new Teacher();

		for (SchoolMember m : arr) {
			if (m instanceof Student) {
				((Student) m).introduce();
				((Student) m).study();

			} else if (m instanceof Teacher) {
				((Teacher) m).introduce();
				((Teacher) m).teach();

			} else if (m instanceof Staff) {
				((Staff) m).introduce();
				((Staff) m).work();
			}
		}
	}

}
