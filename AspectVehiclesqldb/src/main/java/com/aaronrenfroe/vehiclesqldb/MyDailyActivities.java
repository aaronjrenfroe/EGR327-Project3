package com.aaronrenfroe.vehiclesqldb;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by AaronR on 12/3/17.
 * for ?
 */
@Component
public class MyDailyActivities {

    @Scheduled(cron = "5 * * * * *")
    public void getOutOfBed(){
        doIt("Getting out of bed");
    }

    @Scheduled(cron = "10 * * * * *")
    public void shower(){
        doIt("Showering");
    }

    @Scheduled(cron = "15 * * * * *")
    public void eatBreakfast(){
        doIt("Eating Breakfast");
    }

    @Scheduled(cron = "20 * * * * *")
    public void driveToSchool(){
        doIt("Driving To School");
    }

    @Scheduled(cron = "25 * * * * *")
    public void goToClass(){
        doIt("Going to Class");
    }

    @Scheduled(cron = "30 * * * * *")
    public void eatLunch(){
        doIt("Eating Lunch");
    }

    @Scheduled(cron = "35 * * * * *")
    public void workOnSchoolWork(){
        doIt("Working On School Work");
    }

    @Scheduled(cron = "40 * * * * *")
    public void driveHome(){
        doIt("Driving Home");
    }

    @Scheduled(cron = "45 * * * * *")
    public void hugWife(){
        doIt("Greeting Wife..awwww");
    }

    @Scheduled(cron = "50 * * * * *")
    public void study(){
        doIt("Studying");
    }

    @Scheduled(cron = "55 * * * * *")
    public void goToSleep(){
        doIt("Going to Sleep");
    }

    private void doIt(String activity){
        System.out.println(activity);
    }

}
