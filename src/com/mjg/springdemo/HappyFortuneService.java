package com.mjg.springdemo;

/**
 * Created by mgoveas on 12/3/17.
 */
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
