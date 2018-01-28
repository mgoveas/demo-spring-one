package com.mjg.springdemo;

/**
 * Created by mgoveas on 12/3/17.
 */
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it" + fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("Startup");
    }

    public void doMyTeardownStuff() {
        System.out.println("Tear down");
    }
}
