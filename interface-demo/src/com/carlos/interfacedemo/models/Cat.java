package com.carlos.interfacedemo.models;

import com.carlos.interfacedemo.interfaces.Keepable;

public class Cat extends Pet implements Keepable{

	public Cat() {}
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public void showAffection() {
		System.out.println("Purrr....");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Meow...");
		
	}

}
