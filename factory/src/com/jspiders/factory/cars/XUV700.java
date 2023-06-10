package com.jspiders.factory.cars;

import com.jspiders.factory.inter.Car;

public class XUV700 implements Car {

	@Override
	public void buyCar() {
		System.out.println("Bought XUV 700");
	}

}
