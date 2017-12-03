package com.aaronrenfroe.vehiclesqldb;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by AaronR on 12/3/17.
 * for ?
 */
@Component
@Aspect
public class TimedAspect {
    @Pointcut("execution(* com.aaronrenfroe.vehiclesqldb..*(..))")
    public void allMethods(){}

    @Around("allMethods() && @annotation(Timed)")
    public Object profile(final ProceedingJoinPoint jointPoint) throws Throwable {

        final long start = System.currentTimeMillis();
        try{
            return jointPoint.proceed();
        }catch(Throwable t){
            throw t;
        } finally {
            final long stop = System.currentTimeMillis();
            System.out.println("");
            System.out.println("+++ Excecution time of " + jointPoint.getSignature().getName() + " was : " + (stop-start) + "ms");
            System.out.println("");
        }
    }

}
