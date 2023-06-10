package com.jspiders.singleton.object;

public class SingletonEager {
	
	private static SingletonEager object = new SingletonEager();
	private static int count;
	
	private SingletonEager() {
		count++;
		System.out.println("Object created " + count + " times");
	}
	
	public static SingletonEager getObject() {
		System.out.println("Trying to create object");
		return object;
	}

}
