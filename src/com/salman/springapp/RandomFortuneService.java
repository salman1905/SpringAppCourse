package com.salman.springapp;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }

    private String[] data = {
            "AAAAAA", "BBBBB", "LLLLLL"
    };

    private Random myRandom = new Random();
}
