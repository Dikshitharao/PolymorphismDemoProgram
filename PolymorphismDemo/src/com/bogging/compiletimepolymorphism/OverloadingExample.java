package com.bogging.compiletimepolymorphism;

public class OverloadingExample {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	
}
	
	public void sum(double a, double b) {//same name different data type of parameters
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c) {//same name different number of parameters
		System.out.println(a+b+c);
		
	}

	public static void main(String[] args) {
		 OverloadingExample o = new OverloadingExample();
		 o.sum(2, 4);
		 o.sum(2, 4,5);
		 o.sum(9.7, 5.78);
		
		// TODO Auto-generated method stub

	}

}
