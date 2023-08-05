package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach()
    {
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
    //define out init method
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("In doMyStartupStuff"+getClass().getSimpleName());
    }


    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("In doMyCleanUpStuff"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "Practice,  fast balling for 15 min!!!!!!!";
    }
}
