package com.aaronrenfroe.vehiclesqldb;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by AaronR on 12/3/17.
 * for ?
 */

@Component
@Aspect
public class FaithfulAspect {

    @Pointcut("execution(* com.aaronrenfroe.vehiclesqldb.MyDailyActivities..*(..))")
    public void allMethods(){}


    @Before("allMethods()")
    public void prayAndGiveGloryBefore(JoinPoint joinPoint){
        System.out.println("Pray before I execute " + joinPoint.getSignature().getName());
    }


    @After("allMethods()")
    public void prayAndGiveGloryAfter(JoinPoint joinPoint){
        System.out.println("Pray after I execute " + joinPoint.getSignature().getName());

    }


}
