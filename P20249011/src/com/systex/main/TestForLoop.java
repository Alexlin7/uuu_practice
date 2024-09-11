package com.systex.main;

public class TestForLoop {

	public static void main(String[] args) {
		int i = 0;
		for (; i < 100; i++) {
			System.out.println("Loop" + i);	
		}
		System.out.println("i = " + i);
		
		int x = 0;
		for (;;) {
			System.out.println("Endless" + x++);
			if (x == 100) {
				break;
			}
		}
	}

}
