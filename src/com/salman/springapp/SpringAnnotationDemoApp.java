package com.salman.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringAnnotationDemoApp {

    public static void main(String[] args)  {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}
