package com.systex.main;

public class Fibonacci {

    
    public static void main(String[] args) {
    	int range = Integer.parseInt(args[0]);
    	int firstNum = 0;
    	int SecNum = 1;
    	
    	System.out.print("0\t");
    	int num = firstNum + SecNum;
    	int count = 0;
    	while(num < range) {	
    		System.out.print(num + "\t");
    		num = firstNum + SecNum;
    		count += 1;
    		firstNum = SecNum;
    		SecNum = num;
    	}
    	System.out.println();
    	System.out.println("總共有：" + count + "個費波拿西數");
    }
}
