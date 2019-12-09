package com.ase.finals.designpattern.template;

public abstract class RestaurantOrder {
	
	final void sendOrderToKitchen()
	{
		System.out.println("Order sent to kitchen");
	}
	
	final void serveClient()
	{
		System.out.println("Order ready from kitchen, served to client");
	}
	
	final void prepareFinalBill()
	{
		System.out.println("Bill prepared for client");
	}
	
	final void makePayment()
	{
		System.out.println("Client makes payment for given bill - Process Complete");
	}
	
	public abstract void callServer();
	public abstract void selectItemsFromMenu();
	
	public final void readyToPlaceOrder()
	{
		callServer();
		selectItemsFromMenu();
		sendOrderToKitchen();
		serveClient();
		prepareFinalBill();
		makePayment();
	}
}
