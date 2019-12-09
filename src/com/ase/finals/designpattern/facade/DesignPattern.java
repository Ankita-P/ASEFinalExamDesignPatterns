package com.ase.finals.designpattern.facade;

public class DesignPattern {
	private MaintenanceRequestPortal requestPortal = new MaintenanceRequestPortal();
	private MaintenanceEngineerPortal engineerPortal = new MaintenanceEngineerPortal();
	
	public void submitNewMaintenanceRequest(String reportProblem)
	{
		requestPortal.addRequest(reportProblem);
		requestPortal.assignEngineer();
		engineerPortal.showRequestDetails();
		engineerPortal.collectTools();
		engineerPortal.resolveRequest();
		requestPortal.closeRequest();
	}
}
