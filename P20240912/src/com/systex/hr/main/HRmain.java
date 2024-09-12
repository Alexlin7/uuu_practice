package com.systex.hr.main;

import com.systex.hr.model.Accountant;
import com.systex.hr.model.Director;
import com.systex.hr.model.Employee;
import com.systex.hr.model.Enginner;
import com.systex.hr.model.Manager;
import com.systex.hr.model.Secretary;
import com.systex.hr.service.StaffService;

public class HRmain {
	public static void main(String[] args) {
		Enginner e1 = new Enginner("Kevin", "25149588", "Taipei",'M' , "CRM");
		Enginner e2 = new Enginner("Mary", "25149008", "Taipei",'F' , "CRM");
		Enginner e3 = new Enginner("Gary", "25145555", "Taoyuan",'M' , "HR");
		Manager m1 = new Manager("Richard", "82189595", "Taipei",'M' , "IT");
		Manager m2 = new Manager("Kelly", "819200000", "Taipei",'F' , "Education");
		Accountant a1 = new Accountant("kitten", "0566501989", "Taipei",'F' , "Sales");
		Director d1 =new Director("Frank", "82188888", "Taipei",'M' , "IT", 2000000);
		Secretary s1 = new Secretary("Peggy", "11451400", "Taipei",'F' , "Frank");
		
		Employee[] staff = {e1, e2, e3, m1, m2, a1, d1, s1};
		
		StaffService service = new StaffService();
		
		System.out.println("員工報表");
		System.out.println("======================================================");
		System.out.println("姓名\t電話\t\t地址\t性別");
		System.out.println("======================================================");
		service.generateReport(staff);
		System.out.println("======================================================");
		System.out.println("薪資總額：" + service.calcAllSalary(staff));
	}
}
