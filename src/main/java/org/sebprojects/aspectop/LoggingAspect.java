package org.sebprojects.aspectop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* org.sebprojects.aspectop.BusinessService.*(..))")
    public void logBefore() {
    logger.info("Executing findTheGreatestFromAllData method in ASPECT PARADIGM");
    }

    @Before("execution(* org.sebprojects.aspectop.DataRepository.*(..))")
    public void logBefore2() {
        logger.info("Executing DetaRepository method in ASPECT PARADIGM");
    }

}
