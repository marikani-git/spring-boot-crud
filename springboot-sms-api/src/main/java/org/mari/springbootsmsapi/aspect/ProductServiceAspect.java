package org.mari.springbootsmsapi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductServiceAspect {

    @Before(value = "execution(* org.mari.springbootsmsapi.service.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("before method " + joinPoint.getSignature());
    }
}
