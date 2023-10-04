package com.sapient.hybris.service;
/**
 * 
 * @author Admin
 * This interface contains abstract methods that describe the bahaviour
 * of a pet
 */
public interface Pet {
	public abstract void play(); 
	public abstract void followInstructions();
	
	//is same as
	
	//void play; by default methods of an interface are public abstract
}
