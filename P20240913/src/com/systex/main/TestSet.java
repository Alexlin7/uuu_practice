package com.systex.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> fruits = new TreeSet<>();
		fruits.add("Lemon");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		fruits.add("Strawberry");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		System.out.println(fruits.descendingSet());
		System.out.println("================");
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String fruit = (String)it.next();
			System.out.println("Name¡G " + fruit + " Length :" + fruit.length());
		}

	}

}
