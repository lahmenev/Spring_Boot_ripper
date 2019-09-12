package com.example.boot_ripper;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * email : s.lakhmenev@andersenlab.com
 *
 * @author Lakhmenev Sergey
 * @version 1.1
 */

@Service
@Profile("DEV")
@EnableScheduling
public class DeveloperService {

    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        System.out.println("Developers.......");
    }
}
