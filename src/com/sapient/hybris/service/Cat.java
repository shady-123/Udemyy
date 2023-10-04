package com.sapient.hybris.service;

public class Cat extends Animal implements Pet{
	private String name;

	public Cat() {

	}

	public Cat(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Cat [name=" + name + "]";
	}
	
	
}
