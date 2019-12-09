package com.ase.finals.designpattern.abstractFactory;

public interface HomeAppliances {
	public abstract MobileHandsets getHandset(String brandName);
	public abstract Television watchEntertainment(String brandName);
	public abstract SoundSystem connectToTV(String brandName);
}
