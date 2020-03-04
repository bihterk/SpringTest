package com.bikekin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Memur memur = ctx.getBean("ogretmen", Ogretmen.class);
		memur.calis();

	}

}
