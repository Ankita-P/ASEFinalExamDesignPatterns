package com.ase.finals.designpattern.template;

public class TableOne extends RestaurantOrder {

	@Override
	public void selectItemsFromMenu() {
		System.out.println("Order for Apetizer2, MainCourse2, Dessert2 placed");
	}

	@Override
	public void callServer() {
		System.out.println("Server called, arrives at TABLE 1");
		
	}
}
