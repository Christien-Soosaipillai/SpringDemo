package com.christien.dependencyinjection.setterbased;

public class Meal {
	
	
	private Food food;
	private Drink drink;
	
	
	public Food getFood() {
		return food;
	}
	
	public void setFood(Food food) {
		this.food = food;
	}
	
	public Drink getDrink() {
		return drink;
	}
	
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	public void GetMealSummary() {
		double total = food.getPrice() + drink.getPrice();
		System.out.println("Food Items Summary: \n-" + food.getName() + "\n-" + drink.getName() + "\nTotal: " + (total*1.13)  );
	}
	
	
	
	
	
	
}
