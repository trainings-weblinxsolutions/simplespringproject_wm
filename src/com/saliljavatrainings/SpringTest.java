package com.saliljavatrainings;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTest {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("beans.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	System.out.println("Bean Present ? :"+factory.containsBean("bean1"));
	System.out.println("Bean Present ? :"+factory.containsBean("bean2"));
	
	
	Student student1=(Student) factory.getBean("bean1");
	student1.displayInfo();
	
	Student student2=(Student) factory.getBean("bean2");
	student2.displayInfo();
	System.out.println("----Student 3 -- properties not set in applicationContext.xml");
	Student student3=(Student) factory.getBean("bean3");
	student3.displayInfo();
	
	System.out.println("---Student 4 --one property set and other not set");
	Student student4=(Student) factory.getBean("bean4");
	student4.displayInfo();
	
	
	/*
	System.out.println("---Student 5 -- setting up a unknown property");
	Student student5=(Student) factory.getBean("bean5");
	student5.displayInfo();	
	*/

}
}
