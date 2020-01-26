package com.salman.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> inside the default constructor");
    }

    public void doYourJobs(FortuneService fortuneService) {
        System.out.println(">> inside setter injection");
        this.fortuneService = fortuneService;
    }

    //    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice Your Backhand Volley!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
