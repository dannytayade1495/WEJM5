package com.jspiders.singleton.object;

public class SingletonLazy {

	private static SingletonLazy object;
	private static int count;

	private SingletonLazy() {
		count++;
		System.out.println("Object created " + count + " times");
	}

	public static SingletonLazy getObject() {
		System.out.println("Trying to create object");
		if (object == null) {
			object = new SingletonLazy();
		}
		return object;
	}

}
