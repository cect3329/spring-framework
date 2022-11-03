package com.spring.demo;

import com.spring.demo.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhengdp
 * @Description
 * @Date 2022/11/3 22:12
 * @Created by zhengdp
 */
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.demo.service");
		TestService bean = context.getBean(TestService.class);
		bean.testService();
	}
}
