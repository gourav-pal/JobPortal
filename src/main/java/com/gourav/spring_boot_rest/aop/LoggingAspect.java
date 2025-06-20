package com.gourav.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
    public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);

    //return type  classname.methodName(argument)
    @Before("execution(* com.gourav.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called: " +jp.getSignature().getName());
    }
    @After("execution(* com.gourav.spring_boot_rest.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed: " +jp.getSignature().getName());
    }
    @AfterThrowing("execution(* com.gourav.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method called: " +jp.getSignature().getName());
    }

}
