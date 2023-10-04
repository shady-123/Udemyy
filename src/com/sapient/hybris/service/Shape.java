package com.sapient.hybris.service;
/**
 * 
 * @author Admin
 * Computing area is a behaviour that has to be inherited in all its sub classes.
 * But computing area in Shape cannot be defined so declare computeArea() method as
 * abstract method.
 * 
 * Since the class has an abstract megthid, declare the class also has abstract.
 */
public abstract class Shape {
	//abstract method
	public abstract Double computeArea();
	
}
