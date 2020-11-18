package com.christien.lifecycle;

public class WaterSource {

	private String type;

	public void getType() {
		System.out.println("Name of water source: " + type);
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
