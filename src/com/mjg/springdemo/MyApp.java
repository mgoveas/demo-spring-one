package com.mjg.springdemo;

/**
 * Created by mgoveas on 11/28/17.
 */
public class MyApp {
    public static void main(String[] args) {
        //create
        Coach coach = new TrackCoach();
        //use
        System.out.println(coach.getDailyWorkout());
    }
}
