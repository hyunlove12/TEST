package com.test005;


import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		//<>제네릭이 없으면 형 판단을 못 한다. 
		//형 변환 및 검사 필요.
	   
		List list = new ArrayList();
		list.add("hello");
		String str = (String)list.get(0);
		System.out.println(str);
	
	}
}
