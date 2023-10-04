package com.sapient.hybris.service;

public class Cat extends Animal implements Pet{
	private String name;
	private String color;

	public Cat() {

	}
	public Cat(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void play() {
		System.out.println("Playing..");
		
	}

	@Override
	public void followInstructions() {
		System.out.println("Following instructions..");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Meou meou..");
		
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "color= " + color + "]";
	}

	
	
	
}
