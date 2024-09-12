package com.systex.main;


public class Fibonacci {

    
    public static void main(String[] args) {
    	
    	int firstNum = 0;
    	int SecNum = 1;
    	
    	System.out.print("0\t");
    	int num = firstNum + SecNum;
    	
    	while(num < 1000) {	
    		System.out.print(num + "\t");
    		num = firstNum + SecNum;
    		
    		firstNum = SecNum;
    		SecNum = num;
    	}
    	
    }
}
