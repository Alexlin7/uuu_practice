package com.systex.xxx;

public class A {
	public int foo = 100;
	
	public void play () {
		System.out.println("play() in class A");
	}
	
	public void methodA() {
		System.out.println(foo);
		play();
	}
}
