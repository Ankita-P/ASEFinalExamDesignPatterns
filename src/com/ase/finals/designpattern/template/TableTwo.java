package com.ase.finals.designpattern.template;

public class TableTwo extends RestaurantOrder{

	@Override
	public void selectItemsFromMenu() {
		System.out.println("Order placed for items - Apetizer1, MainCourse1, Dessert1");
	}

	@Override
	public void callServer() {
			System.out.println("Server called, arrives at TABLE 2");
	}
}
