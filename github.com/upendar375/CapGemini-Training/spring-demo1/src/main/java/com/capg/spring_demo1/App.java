package com.capg.spring_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//Sim mySim =(Sim)context.getBean("vodaphone");
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Mobile m=context.getBean("mobile",Mobile.class);
     //   m.setSim(mySim);
        m.call();
        m.browse();
        m.showsupportednetworks();
    }
}
