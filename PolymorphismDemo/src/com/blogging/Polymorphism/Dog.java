package com.blogging.Polymorphism;

public class Dog implements Animal {

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("Bow!! Bow!!");
		
	}
	
	public void print() {
		System.out.println("Hey I am Dog and I am trying to implement the default method of the interface");
	}
	
	public void Example() {
		System.out.println("Hey I am Dog and I am trying to implement the static method of the interface");
		
	}
	
	public void breed() {
		System.out.println("Hi I am a German Shepherd!!");
	}

}
