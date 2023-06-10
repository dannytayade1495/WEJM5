package com.jspiders.factory.main;

import java.util.Scanner;

import com.jspiders.factory.cars.Endevour;
import com.jspiders.factory.cars.Harrier;
import com.jspiders.factory.cars.HondaCity;
import com.jspiders.factory.cars.Nexon;
import com.jspiders.factory.cars.XUV700;
import com.jspiders.factory.inter.Car;

public class CarFactory {

	private static Car car;

	public static void main(String[] args) {
		try {
			factory().buyCar();
		} catch (NullPointerException e) {
			System.out.println("No car selected");
		}

	}

	private static Car factory() {
		System.out.println("Car Purchase Options\n"
							+ "1. Harrier\n"
							+ "2. XUV 700\n"
							+ "3. Honda City\n"
							+ "4. Endevour\n"
							+ "5. Nexon");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			car = new Harrier();
			break;
			
		case 2:
			car = new XUV700();
			break;
			
		case 3:
			car = new HondaCity();
			break;
			
		case 4:
			car = new Endevour();
			break;
			
		case 5:
			car = new Nexon();
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}
		scanner.close();
		return car;

	}

}
