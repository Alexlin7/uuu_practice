package com.systex.main;

public class TestSwitch {

	public static void main(String[] args) {
		int carModel = Integer.parseInt(args[0]);
		
		switch (carModel){
			case 1:
				System.out.println("�}�ѵ�");
			case 2:
				System.out.println("�[�Ž�");
			case 3:
				System.out.println("�[���T");
			default:
				System.out.println("�[���l");
				System.out.println("�[����");
		}
		

	}

}
