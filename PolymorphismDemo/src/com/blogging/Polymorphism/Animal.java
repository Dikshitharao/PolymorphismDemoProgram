package com.blogging.Polymorphism;

public interface Animal {
	void Sound();
	default void print() {
		System.out.println("Hi I am an Interface with default method");
	}
	static void Example() {
		System.out.println("Hi I am an interface with static method");
	}
	

}
