package com.systex.main;

public class Loop {

	public static void main(String[] args) {
		int h = Integer.parseInt(args[0]);
		
		System.out.println("Loop1======================");
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
		System.out.println("Loop2======================");
		for (int i = 0; i < h; i++) {
			for (int j = i; j <h; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
		System.out.println("Loop3======================");		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (h-j < i) {
					System.out.print("*\t");
				} else {
					System.out.print(" \t");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("Loop4======================");
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (h-j < i) {
					System.out.print("*\t");
				} else {
					System.out.print(" \t");
				}
				
			}
			for (int j = 1; j <=i-1; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
		System.out.println("Loop5======================");
		for (int i = h; i >= 1; i--) {
			for (int j = h; j >= 1; j--) {
				if (j > i) {
					System.out.print(" \t");
				} else {
					System.out.print("*\t");
				}				
			}
			System.out.println();
		}
		
		System.out.println("Loop6======================");
		for (int i = h; i >= 1; i--) {
			for (int j = h; j > 1; j--) {
				if (j > i) {
					System.out.print(" \t");
				} else {
					System.out.print("*\t");
				}				
			}
			for (int j = 1; j <= h; j++) {
				if (j <= i) {
					System.out.print("*\t");
				} else {
					System.out.print(" \t");
				}				
			}
			System.out.println();
		}
		
		System.out.println("Loop7======================");
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (h-j < i) {
					System.out.print("*\t");
				} else {
					System.out.print(" \t");
				}
				
			}
			for (int j = 1; j <=i-1; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		for (int i = h; i >= 1; i--) {
			if (i == h) continue;
			for (int j = h; j > 1; j--) {
				if (j > i) {
					System.out.print(" \t");
				} else {
					System.out.print("*\t");
				}				
			}
			for (int j = 1; j <= h; j++) {
				if (j <= i) {
					System.out.print("*\t");
				} else {
					System.out.print(" \t");
				}				
			}
			System.out.println();
		}
		
		
		

	}

}
