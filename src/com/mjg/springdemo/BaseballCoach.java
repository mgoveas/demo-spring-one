package com.mjg.springdemo;

/**
 * Created by mgoveas on 11/28/17.
 */
public class BaseballCoach implements Coach{

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
