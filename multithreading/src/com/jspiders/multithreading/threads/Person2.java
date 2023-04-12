package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Account;

public class Person2 extends Thread {
	
	Account account;
	
	public Person2(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.depositAmount(3000);
		account.withdrawAmount(1500);
	}

}
