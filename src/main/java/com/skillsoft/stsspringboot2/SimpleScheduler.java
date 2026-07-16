package com.skillsoft.stsspringboot2;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SimpleScheduler {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //@Scheduled(fixedRate = 3000,initialDelay = 5000)
    @Scheduled(fixedRateString = "${scheduler.rate}")
    public void scheduledLookup() throws InterruptedException {
        System.out.println("The time is now: " + dateFormat.format(new Date()));

        Thread.sleep(5000);
    }
}
