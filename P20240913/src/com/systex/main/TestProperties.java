package com.systex.main;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		Enumeration propsName= props.propertyNames();
		while (propsName.hasMoreElements()) {
			String propName = (String) propsName.nextElement();
			String propValue = props.getProperty(propName);
			System.out.println(propName + " = " + propValue);
		}
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("path.separator"));
	}

}
