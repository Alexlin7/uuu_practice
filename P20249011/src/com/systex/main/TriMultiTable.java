package com.systex.main;

public class TriMultiTable {

	public static void main(String[] args) {
		Outer:
		for (int i = 1; i <= 9; i++) {
			Inner:
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
				if (i == j) {
					System.out.println();
					continue Outer;
				}
			}
			System.out.println();
		}

	}

}
