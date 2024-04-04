package com.example.openschool1.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ExampleAspect {

    @Pointcut("execution(public void info())")
    public void beforePointcut(){}

    @Pointcut("execution(public void info())")
    public void afterPointcut(){}

    @Before("beforePointcut()")
    public void beforeMethod(){
        log.info("before method info");
    }

    @After("afterPointcut()")
    public void afterMethod(){
        log.info("after method info");
    }

    @Before("execution(* com.example.openschool1.model.Info.method2())")
    public void beforePointcutMethod2Call(){
        System.out.println("Метод2 вызван из метода1");
    }
}
