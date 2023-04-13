package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Shop;
import com.jspiders.multithreading.threads.Customer;
import com.jspiders.multithreading.threads.Supplier;

public class ShopMain {
	
	public static void main(String[] args) {
		Shop shop = new Shop(5);
		
		Customer customer = new Customer(shop);
		Supplier supplier = new Supplier(shop);
		
		customer.start();
		supplier.start();
	}

}
