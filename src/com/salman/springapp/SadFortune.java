package com.salman.springapp;

import java.io.IOException;

public class SadFortune implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is sad day!";
    }
}
