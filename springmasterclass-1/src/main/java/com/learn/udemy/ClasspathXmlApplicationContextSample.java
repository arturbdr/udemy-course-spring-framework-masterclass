package com.learn.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasspathXmlApplicationContextSample {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Organization organization = (Organization) ctx.getBean("organization");
        organization.doStuff();

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
