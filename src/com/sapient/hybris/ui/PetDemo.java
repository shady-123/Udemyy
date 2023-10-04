package com.sapient.hybris.ui;

import com.sapient.hybris.service.Animal;
import com.sapient.hybris.service.Cat;
import com.sapient.hybris.service.Dog;
import com.sapient.hybris.service.Pet;
import com.sapient.hybris.service.Tiger;
/*
 * The instances of implementation classes of Pet interface can be stored in
 * array of references of Pet type
 */
public class PetDemo {

	public static void main(String[] args) {
		//Array of references of Animal type
		Animal animal[]= new Animal[3];
		animal[0]= new Tiger(8);
		animal[1]=new Dog("steffy","pomeranian",5, "Golden");
		animal[2]= new Cat("puffy", "Orange");
		
		System.out.println("Displaying animals...");
		for(Animal a: animal) {
			if(a instanceof Tiger) {
				System.out.println("Tiger details..\n"+ a);
			}else if( a instanceof Dog) {
				System.out.println("Dog details..\n"+a);
			}else if(a instanceof Cat) {
				System.out.println("Cat details..\n"+a);
			}
		}
		
		//Array of references of interface Pet type
		//This can hold instances of its implementation classes
		Pet pet[]= new Pet[4];
		
		pet[0]= new Dog("steffy","pomeranian",5, "Skin color");
		pet[1]= new Cat("puffy", "Orange");
		pet[2]= new Dog("mark","bull dog",10, "Whitish Black");
		//The following is error since class Tiger is not the implementation class of Pet
		//pet[3]= new Tiger(12);
		pet[3]=new Cat("miffy", "White and Black");
		
		
		System.out.println("\nDisplaying pets...");
		for(Pet p: pet) {
			if( p instanceof Dog) {
				System.out.println("Dog details..\n"+p);
			}else if(p instanceof Cat) {
				System.out.println("Cat details..\n"+p);
			}
		}

	}

}
