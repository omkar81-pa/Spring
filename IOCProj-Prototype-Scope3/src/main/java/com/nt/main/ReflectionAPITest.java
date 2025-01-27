package com.nt.main;

import java.lang.reflect.Constructor;

public class ReflectionAPITest {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.nt.ston.Printer");
		
		Constructor cons[] = clazz.getDeclaredConstructors();
		cons[0].setAccessible(true);
		
		Object obj1 = cons[0].newInstance();
		Object obj2 = cons[0].newInstance();
		
		System.out.println(obj1.getClass()+" "+obj2.getClass());
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
	}
}
