package com.systex.main;


public class Fibonacci {

    
    public static void main(String[] args) {
    	
    	int firstNum = 0;
    	int SecNum = 1;
    	
    	int num = 0;
    	System.out.print(firstNum + "\t" + SecNum + "\t");
    	while(num < 1000) {	
    		num = firstNum + SecNum;
    		System.out.print(num + "\t");
    		firstNum = SecNum;
    		SecNum = num;
    	}
    	
    }
}
