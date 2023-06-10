package com.jspiders.builderpattern.main;

import com.jspiders.builderpattern.builder.MobileBuilder;
import com.jspiders.builderpattern.object.Mobile;

public class MobileMain {
	
	public static void main(String[] args) {
		Mobile mobile = new MobileBuilder().brand("Samsung")
										.model("S23").memory(256)
										.colour("Black").getMobile();
		System.out.println(mobile);
	}

}
