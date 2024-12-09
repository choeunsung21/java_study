package com.gn.homework03.run;

import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {

	public static void main(String[] args) {
		GasolineEngine c1 = new GasolineEngine();
		ElectricEngine c2 = new ElectricEngine();
		c1.start();
		c2.start();
	}

}
