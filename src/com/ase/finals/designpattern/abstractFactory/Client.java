package com.ase.finals.designpattern.abstractFactory;

public class Client {

	public static void main(String[] args) {
		HomeAppliancesConcreteImplementation appliances = new  HomeAppliancesConcreteImplementation();
		MobileHandsets mobile = appliances.getHandset("Samsung");
		mobile.selectMovie();
		
		SoundSystem soundSystem = appliances.connectToTV("Sony");
		soundSystem.connectToTelevision();
		
		Television television = appliances.watchEntertainment("LG");
		television.switchOn();
	}

}
