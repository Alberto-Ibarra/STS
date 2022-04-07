package com.alberto.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	
	public void fly() {
		System.out.println("swooooosssshhhh");
		this.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		this.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("oooooooo burn!");
		this.setEnergyLevel(getEnergyLevel() - 100);
	}

}
