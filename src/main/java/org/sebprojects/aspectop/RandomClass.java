package org.sebprojects.aspectop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RandomClass implements CommandLineRunner {

    @Autowired
    BusinessService businessService;

    @Override
    public void run(String... args) throws Exception {

        Logger logger = LoggerFactory.getLogger(RandomClass.class);
        logger.info("Starting Seb's RandomClass");

        int value = businessService.findTheGreatestFromAllData();
        System.out.println("The greatest number is: " + value);

        logger.info("Ending Seb's RandomClass");

    }
}
