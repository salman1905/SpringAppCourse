package com.salman.springapp;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Just Be Like Messi!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
