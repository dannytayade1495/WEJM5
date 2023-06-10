package com.jspiders.singleton.main;

import com.jspiders.singleton.object.SingletonEager;
import com.jspiders.singleton.object.SingletonLazy;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		SingletonLazy lazy1 = SingletonLazy.getObject();
		System.out.println(lazy1);
		SingletonLazy lazy2 = SingletonLazy.getObject();
		System.out.println(lazy2);
		
		SingletonEager eager1 = SingletonEager.getObject();
		System.out.println(eager1);
		SingletonEager eager2 = SingletonEager.getObject();
		System.out.println(eager2);
	}

}
