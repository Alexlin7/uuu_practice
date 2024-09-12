package org.animal.model;

public class Dog implements Animal, Pet, Worker {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("¨L¨L¨L");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bar() {
		System.out.println("bar() implementation in Dog.");
	}
	
	

}
