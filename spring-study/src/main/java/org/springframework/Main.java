package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kunsy.study.pojo.User;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("org.springframework.kunsy.*.*");
		applicationContext.refresh();
		System.out.println(applicationContext.getBean(User.class));
	}
}