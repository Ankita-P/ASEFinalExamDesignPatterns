package com.ase.finals.designpattern.template;

public class Client {

	public static void main(String[] args) {
		TableOne tableOne = new TableOne();
		TableTwo tableTwo = new TableTwo();
		
		tableOne.readyToPlaceOrder();
		tableTwo.readyToPlaceOrder();
	}

}
