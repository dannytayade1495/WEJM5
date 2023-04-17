package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Resource;
import com.jspiders.multithreading.threads.Thread1;
import com.jspiders.multithreading.threads.Thread2;

public class DeadlockMain {
	
	public static void main(String[] args) {
		Resource resource = new Resource();
		
		Thread1 thread1 = new Thread1(resource);
		thread1.setName("T1");
		
		Thread2 thread2 = new Thread2(resource);
		thread2.setName("T2");
		
		thread1.start();
		thread2.start();
	}

}