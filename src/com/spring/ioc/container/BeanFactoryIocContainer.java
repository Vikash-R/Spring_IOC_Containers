package com.spring.ioc.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.ioc.model.Message;

public class BeanFactoryIocContainer {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		System.out.println("\n===================  Calling beanFactory.getBean(\"message\") method  ================");		
		Message message0  = (Message)beanFactory.getBean("message");
		System.out.println(message0);


		System.out.println("\n========== Calling beanFactory.getBean(\"message\",Message.class) method =============");
		Message message1  = beanFactory.getBean("message",Message.class);
		System.out.println(message1);

		System.out.println("\n==============  Calling beanFactory.getBean(Message.class) method  ==================");
		Message message2  = beanFactory.getBean(Message.class);
		System.out.println(message2);

		System.out.println("\n============   Calling beanFactory.isSingleton(\"message\") method  ==================");
		boolean bool  = beanFactory.isSingleton("message");
		System.out.println(bool);

		System.out.println("\n============   Calling beanFactory.getAliases(\"message\")  method  ==================");
		String[] aliases  = beanFactory.getAliases("message");
		for(String aka : aliases ) {
			System.out.println(aka);
		}

		System.out.println("\n==============  Calling beanFactory.getType(\"message\") method  ====================");
		Class<?> clazz  = beanFactory.getType("message");
		System.out.println(clazz);

	}

}
