package com.ase.finals.designpattern.facade;

public interface MaintenanceRequest {
	public void addRequest(String problem);
	public void assignEngineer();
	public void closeRequest();
}
