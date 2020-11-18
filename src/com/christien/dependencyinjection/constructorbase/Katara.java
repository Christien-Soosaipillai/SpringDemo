package com.christien.dependencyinjection.constructorbase;

public class Katara {

	private int luck;
	private int dex;
	private int weaponAttack;
	
	
	public Katara(int luck, int dex, int weaponAttack) {
		this.luck = luck;
		this.dex = dex;
		this.weaponAttack = weaponAttack;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	
	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getWeaponAttack() {
		return weaponAttack;
	}

	public void setWeaponAttack(int weaponAttack) {
		this.weaponAttack = weaponAttack;
	}
	
}
