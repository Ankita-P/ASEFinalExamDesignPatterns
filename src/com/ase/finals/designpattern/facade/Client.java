package com.ase.finals.designpattern.facade;

public class Client {
	public static void main(String [] args) {
		DesignPattern maintenancePortal = new DesignPattern();
		maintenancePortal.submitNewMaintenanceRequest("Fire alarm not working");
	}
}
