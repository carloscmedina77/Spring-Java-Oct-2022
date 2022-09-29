package com.carlos.interfacedemo;

import com.carlos.interfacedemo.models.Cat;
import com.carlos.interfacedemo.models.Dog;

public class InterfaceDemoApplication {

	public static void main(String[] args) {
		
		Dog d = new Dog("Pepper");
		Cat c = new Cat("Navi");
		d.showAffection();
		d.askForFood();
		System.out.println("*************");
		c.showAffection();
		c.askForFood();

		
		
	}

}
