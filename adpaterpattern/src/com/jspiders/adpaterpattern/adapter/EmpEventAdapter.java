package com.jspiders.adpaterpattern.adapter;

import com.jspiders.adpaterpattern.entity.Employee;
import com.jspiders.adpaterpattern.entity.Event;

public class EmpEventAdapter extends Employee implements Event {

	@Override
	public void womensDay() {
		System.out.println("Chief guest of the event is : " + this.name);
		System.out.println("Her designation is : " + this.designation);
	}

}
