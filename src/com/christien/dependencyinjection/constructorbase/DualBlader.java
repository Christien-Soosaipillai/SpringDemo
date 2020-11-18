package com.christien.dependencyinjection.constructorbase;

public class DualBlader {
	
	private Dagger dagger;
	private Katara katara;
	
	public DualBlader(Dagger dagger, Katara katara) {
		this.dagger = dagger;
		this.katara = katara;
	}

	public Dagger getDagger() {
		return dagger;
	}

	public void setDagger(Dagger dagger) {
		this.dagger = dagger;
	}

	public Katara getKatara() {
		return katara;
	}

	public void setKatara(Katara katara) {
		this.katara = katara;
	}
	
	public void listStats() {
		int dexTotal = katara.getDex();
		int luckTotal = katara.getLuck() + katara.getLuck();
		int weaponDamage = katara.getWeaponAttack() + dagger.getWeaponAttack();
		System.out.println("Dexterity Total: " + dexTotal + ", Luck Total: " + luckTotal + ", Weapon Damage: " + weaponDamage);;
	}
	

}
