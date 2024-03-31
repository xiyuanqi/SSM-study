package com.pangding.transction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class transctionAOP {
    @Around("execution(* com.pangding.transction..*(..))")
    public void transctionControl(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("开启事务");
            joinPoint.proceed();
            System.out.println("提交事务");
        } catch (Throwable e){
            System.out.println("回滚事务");
        }
    }
}
