package com.jspiders.multithreading.resource;

public class Shop {

	int availableProducts;

	public Shop(int availableProducts) {
		this.availableProducts = availableProducts;
	}

	public synchronized void orderProducts(int noOfProducts) {
		System.out.println
			("Trying to purchase " + noOfProducts + " products");
		if (noOfProducts > availableProducts) {
			System.out.println
				(noOfProducts + " products not available..!!");
			System.out.println("Please wait..!!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableProducts -= noOfProducts;
		System.out.println(noOfProducts + " products purchased");
		System.out.println
			("Now available products : " + availableProducts);
	}

	public synchronized void restockProducts(int noOfProducts) {
		System.out.println
			("Restocking " + noOfProducts + " products...!!");
		availableProducts += noOfProducts;
		System.out.println
			("Now available products : " + availableProducts);
		this.notify();
	}

}
