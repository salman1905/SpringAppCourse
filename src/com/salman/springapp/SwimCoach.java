package com.salman.springapp;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter as a warm up!";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
