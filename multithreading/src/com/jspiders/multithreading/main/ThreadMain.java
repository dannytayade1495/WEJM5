package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread3;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();
		
	}

}
