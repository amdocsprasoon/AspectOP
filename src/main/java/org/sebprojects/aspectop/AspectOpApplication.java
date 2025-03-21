package org.sebprojects.aspectop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectOpApplication {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(AspectOpApplication.class);

        logger.info("Starting Seb's AspectOpApplication");
        SpringApplication.run(AspectOpApplication.class, args);
        logger.info("Ending Seb's AspectOpApplication");
    }

}
