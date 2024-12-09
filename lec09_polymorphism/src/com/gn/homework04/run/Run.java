package com.gn.homework04.run;

import com.gn.homework04.model.vo.GalaxyS24;
import com.gn.homework04.model.vo.Iphone15;
import com.gn.homework04.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] arr = new SmartPhone[2];
		arr[0] = new GalaxyS24();
		arr[1] = new Iphone15();

		for (SmartPhone sp : arr) {
			if (sp instanceof GalaxyS24) {
				System.out.print("갤럭시S24는 ");
				sp.printMaker();
				System.out.println("에서 만들어졌다.");
			} else {
				System.out.print("아이폰15는 ");
				sp.printMaker();
				System.out.println("에서 만들어졌다.");
			}
			sp.makeCall();
			sp.takeCall();
			sp.touch();
			sp.charge();
			sp.picture();
			System.out.println();
		}
	}

}
