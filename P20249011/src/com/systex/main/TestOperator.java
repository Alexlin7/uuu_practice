package com.systex.main;

public class TestOperator {

	public static void main(String[] args) {
		byte a = 1;
		byte b = 1;
		byte c = (byte)(a + b);// �B��L��|�ܦ�int ���૬

		int age = 50;
		System.out.println(age*365*24*60*60*1000L); //�W�Xint�����d�� �ݭn��long
		
		System.out.println(111+222+333);
		System.out.println("111"+222+333);
		System.out.println(111+"222"+333);
		System.out.println(111+222+"333");
		
		int x = 5;
		int y = 5;
		int z = 5;
		
		if ((++x < 10) | (++y < 10) | (++z < 10)) {
			System.out.println("Bingo!");
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
	}

}
