package com.salman.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TennisCoach implements Coach{


    @Qualifier("newWorld")
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
    }

    public void doYourJobs(FortuneService fortuneService) {
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
    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}
