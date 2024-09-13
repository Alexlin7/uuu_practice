package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("Lemon");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		fruits.add("Strawberry");
		fruits.add("Pineapple");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		System.out.println("=======for loop=========");
		for (int i = 0; i < fruits.size(); i++) {
			String fruit = (String)fruits.get(i);
			System.out.println("Name¡G " + fruit + " Length :" + fruit.length());
		}
		System.out.println("=======Iterator=========");
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String fruit = (String)it.next();
			System.out.println("Name¡G " + fruit + " Length :" + fruit.length());
		}
		System.out.println("=======lambda=========");
		fruits.forEach(fruit -> System.out.println("Name¡G " + fruit + " Length :" + fruit.length()));
	}

}
