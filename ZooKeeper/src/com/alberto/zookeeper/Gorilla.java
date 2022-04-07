package com.alberto.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println(" I threw a banana!");
		this.setEnergyLevel(this.getEnergyLevel() - 5) ;
	}
	
	public void eatBananas() {
		System.out.println(" This banana is the bomb!");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println(" I'm going to climb this banana tree!");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
