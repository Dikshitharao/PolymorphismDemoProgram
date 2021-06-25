package com.blogging.Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Animal dog = new Dog();//Upcasting
          
          dog.print();/*calling interface method, Observe the output the method, priority will be given to the child class
          i.e. dog's method i.e overridden method implementation and not to the animal's method and observe that 
          we cannot override static method of the interface*/
          
          
          //To call a static method of the interface we have to use the interface name.
          Animal.Example();
          
          dog.Sound();//calling the overridden method.
          //We cannot call breed() method of Dog through Super class object therefore
          //we have to either create an object of dog class or downcast dog object
          
          Dog d = (Dog)dog;//Downcasting assigning parent class object reference to child class
          d.breed();
          
          Animal cat = new Cat();//Upcasting
          cat.print();//calling interface method as there is no overideen of this method in the cat class
          cat.Sound();//calling the overridden method.
          
          
          
          
         
          
	}

}
