package com.aaronrenfroe.vehiclesqldb;

import org.aspectj.lang.JoinPoint;
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
public class LoggingAspect {

    @Pointcut("execution(* com.aaronrenfroe.vehiclesqldb..*(..))")
    public void allMethods(){}

    @Before("allMethods() && @annotation(Logged)")
    public void log(JoinPoint jointPoint) throws Throwable {
        System.out.println("");
        System.out.println("*** Executing " + jointPoint.getSignature());
        Object[] args = jointPoint.getArgs();
        for (Object o : args) {
            System.out.println("***     " + o.getClass().getSimpleName() + " = " + o);
        }
        System.out.println("");
    }
}
