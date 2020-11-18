package com.christien.lifecycle;

public class Garden {

	private Plant plant;
	private WaterSource waterSource;
	
	public Garden() {}
	
	public Garden(Plant plant, WaterSource waterSource) {
		this.plant = plant;
		this.waterSource = waterSource;
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public WaterSource getWaterSource() {
		return waterSource;
	}

	public void setWaterSource(WaterSource waterSource) {
		this.waterSource = waterSource;
	}
	
	public void bloomingGarden() {
		
		System.out.println("The garden uses the following: ");
		plant.getName();
		waterSource.getType();
	}
	
	
}
