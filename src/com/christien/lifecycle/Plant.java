package com.christien.lifecycle;

public class Plant {
	
	private String name;
	
	public Plant() {}

	public Plant(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println("Name of plant: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initPlant() {
		System.out.println("Init: Planting seeds for " + name);
	}
	
	public void destroyPlant() {
		System.out.println("Destory: " + name + " has withered away...");
	}
	
}
	