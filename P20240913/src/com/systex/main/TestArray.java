package com.systex.main;

import java.util.Arrays;

import com.systex.util.MyMath;

public class TestArray {

	public static void main(String[] args) {
		String[] friends = {"Gary", "Patty", "Mary", "Kevin", "Louis"};
		
		int[] grades;
		grades = new int[]{98, 88, 75, 66, 100};//先宣告 後給值 需要宣告new int[]
		
		System.out.println(Arrays.toString(friends));
		System.out.println(Arrays.toString(grades));
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		System.out.println("================================");
		for (int i : grades) {
			System.out.println(i);
		}
		
		int[][] numbers = {
				{1, 5, 6 ,7, 2},
				{2, 3, 6},
				{2, 2, 6, 7, 22, 88},
				{123, 66, 66}
		};
		
		System.out.println(Arrays.deepToString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			int sum = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
			}
			System.out.println((double)sum/numbers[i].length);
		}
		
		for (int[] is : numbers) {
			int sum = 0;
			for (int num : is) {
				sum += num;
			}
			System.out.println((double)sum/ is.length);
		}
		
		String[] names = {"Gary", "Patty", "Mary", "Kevin", "Louis"};
		String[] newName = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		System.arraycopy(names, 0, newName, 3, names.length);
		
		System.out.println(Arrays.toString(newName));
		
		System.out.println(MyMath.average(1, 2, 3, 4, 5, 1.55, 'C'));
		System.out.println(MyMath.average());
		System.out.println(MyMath.average(0));
	}

}
