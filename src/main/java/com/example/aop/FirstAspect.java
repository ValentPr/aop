package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class FirstAspect {
//    @Pointcut("within(com.example.aop.beans.TestBean)")
//    public void isBeanPackage() {
//    }
//
//@Pointcut("bean(TestBean*)")
//public void isInitMethod() {
//}

//    @Pointcut("execution(public void com.example.aop.beans.TestBean.init())")
//    public void isInitMethod() {
//    }
//
//    @Before("isInitMethod()")
//    public void addLogging() {
//        log.info("Advice");
//    }

    @Around("@annotation(LogExecutionTime)")
    public void addLoggingWithAnnotation() {
        log.info("Around advice");
    }

//    @Around("@annotation(LogExecutionTime)")
//    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//
//        Object proceed = joinPoint.proceed();
//
//        long executionTime = System.currentTimeMillis() - start;
//
//        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
//        return proceed;
//    }
}
