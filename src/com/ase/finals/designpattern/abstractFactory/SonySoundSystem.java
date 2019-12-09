package com.ase.finals.designpattern.abstractFactory;

public class SonySoundSystem implements SoundSystem {

	@Override
	public void connectToTelevision() {
		System.out.println("Connection of Sony sound system to Television successful");
	}

}
