package com.learn.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextSample {

    public static void main(String[] args) {

        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

        Organization organization = (Organization) ctx.getBean("organization");
        organization.doStuff();

        ((org.springframework.context.support.FileSystemXmlApplicationContext) ctx).close();
    }
}
