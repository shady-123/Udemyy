package com.sapient.hybris.service;

public class Tiger extends Animal {
	private Integer age;
	
	public Tiger() {
		
	}

	public Tiger(Integer age) {
		super();
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public void makeSound() {
		System.out.println("Roaring..");
		
	}

	@Override
	public String toString() {
		return "Tiger [age=" + age + "]";
	}
	
	
	
}
