package com.systex.hr.model;

public enum ESeasons {
	SPRING("¬K"), SUMMER("®L"), FALL("¬î"), WINTER("¥V");
	
	private final String name;
	
	private ESeasons(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
