package com.systex.main;

public class AddArgument {

	public static void main(String[] args) {
		//try {
			int sum = 0;
			
			for (String number : args) {
				try {
					sum += Integer.parseInt(number);
				} catch (Exception e) {
					System.out.println("�Ѽ�['" + number + "']�����T");
				}
				
			}
			
			System.out.println("�`�M : " + sum);
		//} catch (NumberFormatException e) {
			//System.out.println("�z��J��������ƥi�঳�~�A�бz�A�ˬd�@��");
		//}
		System.out.println("�P�±z�ϥΥ��{��");
	}

}
