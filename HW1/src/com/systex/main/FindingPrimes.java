package com.systex.main;

public class FindingPrimes {

	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int count = 0; 
		for (int i = 0; i <= range; i++) {
			if (isPrimeNum(i)) {
				count += 1;
				System.out.println(i);
			}
			
		}
		System.out.println("總共有：" + count + "個質數");
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
