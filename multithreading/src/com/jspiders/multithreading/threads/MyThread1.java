package com.jspiders.multithreading.threads;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Name of thread : " 
							+ this.getName());
		System.out.println("Priority of thread : " 
							+ this.getPriority());
	}

}
