package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Resource;

public class Thread2 extends Thread {
	
	Resource resource;

	public Thread2(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		synchronized (resource.resource2) {
			System.out.println
			(this.getName() + " locked " + resource.resource2);
			synchronized (resource.resource1) {
				System.out.println
				(this.getName() + " locked " + resource.resource1);
			}
			System.out.println
			(this.getName() + " released " + resource.resource1);
		}
		System.out.println
		(this.getName() + " released " + resource.resource2);
	}
	
}
