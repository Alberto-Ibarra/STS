package com.alberto.zookeeper;

public class Mammal {
	private double energyLevel;
	
public Mammal() {
	this.energyLevel=100;
}

public double getEnergyLevel() {
	return energyLevel;
}

public void setEnergyLevel(double energyLevel) {
	this.energyLevel = energyLevel;
}

public void displayEnergy() {
	System.out.println(energyLevel);
}


}
