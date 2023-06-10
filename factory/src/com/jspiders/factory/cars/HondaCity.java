package com.jspiders.factory.cars;

import com.jspiders.factory.inter.Car;

public class HondaCity implements Car {
	
	@Override
	public void buyCar() {
		System.out.println("Bought Honda City");
	}

}
