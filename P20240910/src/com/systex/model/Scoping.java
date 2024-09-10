package com.systex.model;

public class Scoping {
	public static int a; //Class Variable
	public int b; //Member Variable or Attribute or Instance Variable or Filed
	public final int MYCONT = 100; //Compile-Time Constant
	
	public void callMe(int c, int d) {
		int e;
		if(c > 10) {
			int f;
			f = 100;
			System.out.println("f = " + f);
		}
		
		long g = 12345678900L;
		float h = 123.456F;
	}
}
