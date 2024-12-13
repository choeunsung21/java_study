package com.gn.study.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.study.practice09.model.vo.Information;

public class Run {

	public static void main(String[] args) {
		Map<String, Information> infoMap = new HashMap<String, Information>();
		infoMap.put("Tom", new Information("555-123-4567", 4600000));
		infoMap.put("John", new Information("123-456-7890", 3800000));
		infoMap.put("Emma", new Information("987-654-3210", 2300000));
		System.out.println("변경전 : " + infoMap);
//		infoMap.put("John", new Information("123-456-7890", 4100000));
		infoMap.get("John").setSalary(4100000);
		infoMap.get("Emma").setPhone("111-111-1111");
		System.out.println("변경후 : " + infoMap);

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("=====Emma의 정보=====");
		System.out.println("전화번호 : " + infoMap.get("Emma").getPhone());
		System.out.println("월급 : " + infoMap.get("Emma").getSalary());
	}

}
