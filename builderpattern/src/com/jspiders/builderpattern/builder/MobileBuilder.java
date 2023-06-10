package com.jspiders.builderpattern.builder;

import com.jspiders.builderpattern.object.Mobile;

public class MobileBuilder {
	
	private String brand;
	private String model;
	private String colour;
	private double price;
	private int ram;
	private int memory;
	private String os;
	private double disp_size;
	private int disp_res;
	private int front_cam;
	private int rear_cam;
	
	public MobileBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public MobileBuilder model(String model) {
		this.model = model;
		return this;
	}
	
	public MobileBuilder colour(String colour) {
		this.colour = colour;
		return this;
	}
	
	public MobileBuilder price(double price) {
		this.price = price;
		return this;
	}
	
	public MobileBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public MobileBuilder memory(int memory) {
		this.memory = memory;
		return this;
	}
	
	public MobileBuilder os(String os) {
		this.os = os;
		return this;
	}
	
	public MobileBuilder dispSize(double disp_size) {
		this.disp_size = disp_size;
		return this;
	}
	
	public MobileBuilder dispRes(int disp_res) {
		this.disp_res = disp_res;
		return this;
	}
	
	public MobileBuilder frontCam(int front_cam) {
		this.front_cam = front_cam;
		return this;
	}
	
	public MobileBuilder rearCam(int rear_cam) {
		this.rear_cam = rear_cam;
		return this;
	}
	
	public Mobile getMobile() {
		return new Mobile(brand, model, colour, price, ram,
							memory, os, disp_size, disp_res,
							front_cam, rear_cam);
	}

}
