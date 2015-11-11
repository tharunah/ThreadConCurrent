package com.mypractice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String... a) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.setMessage("Myname Tharuna");

		System.out.println(hello.getMessage());
		System.out.println(objB.getMessage());

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

	}
}
