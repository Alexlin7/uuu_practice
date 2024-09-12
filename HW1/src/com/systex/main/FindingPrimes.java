package com.systex.main;

public class FindingPrimes {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (isPrimeNum(i)) {
				System.out.println(i);
			}
			
		}
	}
	
	public static boolean isPrimeNum(int n) {
		if (n > 2) {
			for (int i = 2; i < n; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return n==2;
		}
		
	}

}
