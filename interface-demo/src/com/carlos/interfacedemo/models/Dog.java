package com.carlos.interfacedemo.models;

import com.carlos.interfacedemo.interfaces.Keepable;

public class Dog extends Pet implements Keepable{

	public Dog() {}
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void showAffection() {
		System.out.println("Lick... ");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Whimper...");
		
	}
	
	
}
