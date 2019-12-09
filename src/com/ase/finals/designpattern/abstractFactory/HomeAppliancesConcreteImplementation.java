package com.ase.finals.designpattern.abstractFactory;

public class HomeAppliancesConcreteImplementation implements HomeAppliances {

	@Override
	public MobileHandsets getHandset(String brandName) {
		if(brandName.equalsIgnoreCase("Samsung"))
		{
			MobileHandsets handset = new SamsungHandset();
			return handset;
		}
		else
		{
			MobileHandsets handset = new MotorolaHandset();
			return handset;
		}
	}

	@Override
	public Television watchEntertainment(String brandName) {
		if(brandName.equalsIgnoreCase("LG"))
		{
			Television television = new LGTV();
			return television;
		}
		else
		{
			Television television = new XiaomiTV();
			return television;
		}
		
	}

	@Override
	public SoundSystem connectToTV(String brandName) {
		if(brandName.equalsIgnoreCase("Bose"))
		{
			SoundSystem soundSystem = new BoseSoundSystem();
			return soundSystem;
		}
		else
		{
			SoundSystem soundSystem = new SonySoundSystem();
			return soundSystem;
		}
		
	} 
}
