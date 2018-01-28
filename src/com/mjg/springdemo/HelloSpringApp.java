package com.mjg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mgoveas on 12/3/17.
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
