package com.systex.main;

public class AddArgument {

	public static void main(String[] args) {
		//try {
			int sum = 0;
			
			for (String number : args) {
				try {
					sum += Integer.parseInt(number);
				} catch (Exception e) {
					System.out.println("參數['" + number + "']不正確");
				}
				
			}
			
			System.out.println("總和 : " + sum);
		//} catch (NumberFormatException e) {
			//System.out.println("您輸入的部分資料可能有誤，請您再檢查一次");
		//}
		System.out.println("感謝您使用本程式");
	}

}
