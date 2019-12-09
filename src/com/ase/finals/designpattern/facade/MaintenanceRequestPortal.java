package com.ase.finals.designpattern.facade;

public class MaintenanceRequestPortal implements MaintenanceRequest {

	@Override
	public void addRequest(String problem) {
		System.out.println("Request Portal - Maintenance request - '"+problem+"' added to system");
	}

	@Override
	public void assignEngineer() {
		System.out.println("Request Portal - Engineer assigned to request");
	}

	@Override
	public void closeRequest() {
		System.out.println("Request Portal - Maintenance request has been resolved and closed");
	}

}
