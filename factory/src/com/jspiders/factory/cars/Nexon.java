package com.jspiders.factory.cars;

import com.jspiders.factory.inter.Car;

public class Nexon implements Car {
	
	@Override
	public void buyCar() {
		System.out.println("Bought Nexon");
	}

}
