package com.salman.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.salman.springapp")
public class SportConfig {

    @Bean
    FortuneService sadFortuneService(){
        return new SadFortune();
    }

    @Bean
    Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
