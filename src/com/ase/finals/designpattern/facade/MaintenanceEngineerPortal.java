package com.ase.finals.designpattern.facade;

public class MaintenanceEngineerPortal implements MaintenanceEngineer {

	@Override
	public void showRequestDetails() {
		System.out.println("Engineer Portal - Show details of assigned request");
	}

	@Override
	public void collectTools() {
		System.out.println("Engineer Portal - Collecting tools required to resolve the request");
	}

	@Override
	public void resolveRequest() {
		System.out.println("Engineer Portal - Work completed on the request, problem is resolved");
	}

}
