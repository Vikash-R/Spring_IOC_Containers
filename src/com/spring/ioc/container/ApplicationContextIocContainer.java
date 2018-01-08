package com.spring.ioc.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.ioc.model.Message;

public class ApplicationContextIocContainer {

	public static void main(String[] args) {

		/*
		 * Using ClassPathXmlApplicationContext.class
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("\n===================  Calling context.getBean(\"message\") method  ================");		
		Message message0  = (Message)context.getBean("message");
		System.out.println(message0);


		System.out.println("\n========== Calling context.getBean(\"message\",Message.class) method =============");
		Message message1  = context.getBean("message",Message.class);
		System.out.println(message1);

		System.out.println("\n==============  Calling context.getBean(Message.class) method  ==================");
		Message message2  = context.getBean(Message.class);
		System.out.println(message2);

		System.out.println("\n============   Calling context.isSingleton(\"message\") method  ==================");
		boolean bool  = context.isSingleton("message");
		System.out.println(bool);

		System.out.println("\n============   Calling context.getAliases(\"message\")  method  ==================");
		String[] aliases  = context.getAliases("message");
		for(String aka : aliases ) {
			System.out.println(aka);
		}

		System.out.println("\n==============  Calling context.getType(\"message\") method  ====================");
		Class<?> clazz  = context.getType("message");
		System.out.println(clazz);

		((AbstractApplicationContext) context).close();


		/////////////////////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * Using FileSystemXmlApplicationContext.class
		 */
		ApplicationContext context1 = new FileSystemXmlApplicationContext("src/beans.xml");

		System.out.println("\n===================  Calling context.getBean(\"message\") method  ================");		
		Message message01  = (Message)context1.getBean("message");
		System.out.println(message01);


		System.out.println("\n========== Calling context.getBean(\"message\",Message.class) method =============");
		Message message11  = context1.getBean("message",Message.class);
		System.out.println(message11);

		System.out.println("\n==============  Calling context.getBean(Message.class) method  ==================");
		Message message21  = context1.getBean(Message.class);
		System.out.println(message21);

		System.out.println("\n============   Calling context.isSingleton(\"message\") method  ==================");
		boolean bool1  = context1.isSingleton("message");
		System.out.println(bool1);

		System.out.println("\n============   Calling context.getAliases(\"message\")  method  ==================");
		String[] aliases1  = context1.getAliases("message");
		for(String aka : aliases1 ) {
			System.out.println(aka);
		}

		System.out.println("\n==============  Calling context.getType(\"message\") method  ====================");
		Class<?> clazz1  = context1.getType("message");
		System.out.println(clazz1);

		((AbstractApplicationContext) context1).close();

	}

}
