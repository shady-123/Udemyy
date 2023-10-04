package com.sapient.hybris.service;
/**
 * 
 * @author Admin
 * Dog is sub class of Animal and implementation class of Pet
 */
public class Dog extends Animal implements Pet{
	private String name;
	private String breed;
	private Integer age;
	private String color;
	
	public Dog() {
		
	}

	public Dog(String name, String breed, Integer age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void play() {
		System.out.println("Playing....");
		
	}

	@Override
	public void followInstructions() {
		System.out.println("Follow the instruuctions...");
		
	}

	@Override
	public void makeSound() {
		System.out.println("bhou bhou..");
		
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	
	
	
	

}
