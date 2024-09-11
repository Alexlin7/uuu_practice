package com.systex.main;

public class DaysInMonth {

	public static void main(String[] args) {
		int year  = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year + "年的" + month + "月為：31天");
			break;
		case 2:
			if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
				System.out.println(year + "年為閏年，該年的" + month + "月為：29天");
				break;
			}
			System.out.println(year + "年的" + month + "月為：28天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year + "年的" + month + "月為：30天");
			break;
			
		default:
			System.out.println("兄弟...一年只有12個月");
		}

	}

}
