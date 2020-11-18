package com.christien.dependencyinjection.constructorbase;

public class Dagger {
	
	private int luck;
	private int weaponAttack;
		

	public Dagger(int luck, int weaponAttack) {
		this.luck = luck;
		this.weaponAttack = weaponAttack;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getWeaponAttack() {
		return weaponAttack;
	}

	public void setWeaponAttack(int weaponAttack) {
		this.weaponAttack = weaponAttack;
	}
	
	
	
}
