package com.mjg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mgoveas on 12/4/17.
 */
public class SetterDemoApp {
    public static void main(String[] args) {
        //load config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call method
        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println(cricketCoach.getDailyFortune());

        System.out.println(cricketCoach.getEmailAddress());

        System.out.println(cricketCoach.getTeam());

        //close context
        context.close();
    }
}
