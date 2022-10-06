package com.kunsy.study.spring;

import com.kunsy.study.spring.entity.Company;
import com.kunsy.study.spring.entity.HelloSpring;
import com.kunsy.study.spring.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudySpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xmlAppContext = new ClassPathXmlApplicationContext("classpath:SpringBeanCxt.xml","classpath:SpringBean-company.xml");
		User user = xmlAppContext.getBean(User.class);
		System.out.println("123avc刘明洋测洋试456测洋试");
		System.out.println("测试123春456何林春123");
		System.out.println(user);
		Company company = xmlAppContext.getBean(Company.class);
		System.out.println(company.getName());
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloSpring helloSpring = appContext.getBean(HelloSpring.class);
		helloSpring.hello();
	}
}
