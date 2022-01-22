package com.kunsy.study.spring;

import com.kunsy.study.spring.entity.HelloSpring;
import com.kunsy.study.spring.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudySpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xmlAppContext = new ClassPathXmlApplicationContext("classpath:SpringBeanCxt.xml");
		User user = xmlAppContext.getBean(User.class);
		System.out.println(user);
//		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//		HelloSpring helloSpring = appContext.getBean(HelloSpring.class);
//		helloSpring.hello();
	}
}
