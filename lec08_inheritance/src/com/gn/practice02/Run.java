package com.gn.practice02;

public class Run {

	public static void main(String[] args) {

		Appliance app = new Appliance();
		WashingMachine wash = new WashingMachine();
		Refrigerator ref = new Refrigerator();

		app.turnOn();
		wash.turnOn();
		ref.turnOn();

	}

}
