package com.salman.springapp;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today Is Your Luck Day!!!";
    }
}
