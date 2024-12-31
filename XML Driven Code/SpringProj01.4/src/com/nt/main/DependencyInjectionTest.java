package com.nt.main;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()");
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String result = generator.generateWishMessage("raja");
		System.out.println(result);
		
		ctx.close();
		System.out.println("DependencyInjectionTest.main()");
	}
}
