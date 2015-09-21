package com.foomoo.example.spring.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"helloSpring.xml");
		ChatterBox bean = context.getBean("chatterBox", ChatterBox.class);
		bean.saySomething("This should appear once.");
		bean.saySaySomething("This should appear twice.");
	}
}
