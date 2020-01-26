package com.salman.springapp;

import java.io.IOException;

public interface Coach {

    String getDailyWorkout();
    String getDailyFortune() throws IOException;
}
