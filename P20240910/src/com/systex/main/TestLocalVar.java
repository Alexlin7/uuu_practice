package com.systex.main;

public class TestLocalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3, j=0;
		
		if (j == 0) {
			i = 1;
		} else if(j != 0) {
			i = 2;
		}
		
		System.out.println("i = " + i);
	}

}
