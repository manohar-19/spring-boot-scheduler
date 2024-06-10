package com.manu.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduleTest {
    // Runs with a fixed delay of 5 seconds between the end of the last invocation and the start of the next
//    @Scheduled(fixedDelay = 5000)

    // Runs every 5 seconds
//    @Scheduled(fixedRate = 5000)
    public void print1() {
        System.out.println("Task performed at " + LocalDateTime.now());
    }

    //    second minute hour day-of-month month day-of-week
//      30: Second (30th second)
//      2: Minute (2nd minute)
//      13: Hour (1 PM, in 24-hour format)
//      6: Day of the month (6th)
//      7: Month (July)
//      ? or * : Day of the week (no specific day of the week, as it's already specified by the day of the month)
    @Scheduled(cron = "30 2 13 6 7 *")
    public void print2() {
        System.out.println("Task performed at " + LocalDateTime.now());
    }

    //    shedule for every week at 12 pm 30 min
    @Scheduled(cron = "0 30 12 * * MON")
    public void print3() {
        System.out.println("Task performed at " + LocalDateTime.now());
    }
    //Every Weekday at 8 AM:
    //0 0 8 * * MON-FRI

//    Every Weekend at 10 AM:
//    0 0 10 * * SAT,SUN
}
