package com.gn.study.practice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Map<Integer, Fruit> fruitMap = new HashMap<Integer, Fruit>();
		fruitMap.put(1, new Fruit("귤", "제주", 10, 15000));
		fruitMap.put(2, new Fruit("사과", "예산", 5, 25000));
		fruitMap.put(3, new Fruit("포도", "강화도", 5, 35000));
		fruitMap.put(4, new Fruit("배", "나주", 10, 50000));

		System.out.println("===전체 데이터 조회===");
		Set<Integer> keySet = fruitMap.keySet();
		Iterator<Integer> itKey = keySet.iterator();
		while (itKey.hasNext()) {
			Integer key = itKey.next();
			Fruit value = fruitMap.get(key);
			String name = value.getName();
			String origin = value.getOrigin();
			int count = value.getCount();
			int price = value.getPrice();
			System.out.println(
					key + " : [name=" + name + ", origin=" + origin + ", count=" + count + ", price=" + price + "]");
		}

		System.out.println("===가격 20000원 이상===");
		Set<Entry<Integer, Fruit>> entrySet = fruitMap.entrySet();
		Iterator<Entry<Integer, Fruit>> itEntry = entrySet.iterator();
		while (itEntry.hasNext()) {
			Entry<Integer, Fruit> entry = itEntry.next();
			Integer key = entry.getKey();
			Fruit value = entry.getValue();
			if (value.getPrice() < 20000) {
				continue;
			}
			System.out.println(key + " : " + value);
		}

		System.out.println("===이름이 한글자인 과일===");
		Set<Integer> keySet2 = fruitMap.keySet();
		Iterator<Integer> itKey2 = keySet2.iterator();
		while (itKey2.hasNext()) {
			Integer key = itKey2.next();
			Fruit value = fruitMap.get(key);
			String name = value.getName();
			String origin = value.getOrigin();
			int count = value.getCount();
			int price = value.getPrice();
			if (value.getName().length() == 1) {
				System.out.println(key + " : [name=" + name + ", origin=" + origin + ", count=" + count + ", price="
						+ price + "]");
			}

		}
		System.out.println("===포도 가격 변동===");
		Fruit grape = fruitMap.get(3);
		grape.setPrice(28000);
		Set<Entry<Integer, Fruit>> entrySet2 = fruitMap.entrySet();
		Iterator<Entry<Integer, Fruit>> itEntry2 = entrySet2.iterator();
		while (itEntry2.hasNext()) {
			Entry<Integer, Fruit> entry = itEntry2.next();
			Integer key = entry.getKey();
			Fruit value = entry.getValue();
			if (key == 3) {
				System.out.println(key + " : " + value);
			}
		}
	}

}
