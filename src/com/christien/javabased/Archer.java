package com.christien.javabased;

public class Archer {

	private String name;
	private Bow bow;
	
	public Archer(String name, Bow bow) {
		System.out.println("REQUESTING ARCHER");
		this.name = name;
		this.bow = bow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bow getBow() {
		return bow;
	}
	
	public void setBow(Bow bow) {
		this.bow = bow;
	}

	@Override
	public String toString() {
		return "Archer [name=" + name + ", bow=" + bow + "]";
	}
	
	
}
