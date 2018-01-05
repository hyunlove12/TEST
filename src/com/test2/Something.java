package com.test2;

public class Something {
	
	private int a;
	private String b;
		
	@Override
	public String toString() {
		return String.format("a는: %d, b는: %s", a, b);
	}
}
