package com.christien.dependencyinjection.constructorbase;

public class CarTester {

	private EmissionTester emissionTester;	
	
	public CarTester(EmissionTester emissionTester) {
		this.emissionTester = emissionTester;
	}

	public EmissionTester getEmissionTester() {
		return emissionTester;
	}

	public void setEmissionTester(EmissionTester emissionTester) {
		this.emissionTester = emissionTester;
	}
	
}
