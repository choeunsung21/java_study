package com.gn.study.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.practice08.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		Set<Person> p1 = new HashSet<Person>();
		Set<Person> p2 = new HashSet<Person>();

		p1.add(new Person("홍길동", 20));
		p1.add(new Person("이순신", 25));
		p1.add(new Person("유관순", 22));

		p2.add(new Person("유관순", 22));
		p2.add(new Person("강감찬", 27));
		p2.add(new Person("을지문덕", 30));

		System.out.println("===합집합===");
		Set<Person> union = new TreeSet<Person>(p1);
		union.addAll(p2);
		int num = 1;
		Iterator<Person> iterator = union.iterator();
		while (iterator.hasNext()) {
			System.out.print(num + "번 ");
			System.out.println(iterator.next());
			num++;
		}

		System.out.println("===교집합===");
		Set<Person> intersection = new TreeSet<Person>(p1);
		intersection.retainAll(p2);
		num = 1;
		iterator = intersection.iterator();
		while (iterator.hasNext()) {
			System.out.print(num + "번 ");
			System.out.println(iterator.next());
			num++;
		}

		System.out.println("===차집합===");
		Set<Person> difference = new TreeSet<Person>(p1);
		difference.removeAll(p2);
		num = 1;
		iterator = difference.iterator();
		while (iterator.hasNext()) {
			System.out.print(num + "번 ");
			System.out.println(iterator.next());
			num++;
		}

	}

}
