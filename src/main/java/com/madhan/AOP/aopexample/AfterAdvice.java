/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.AOP.aopexample;

import java.lang.reflect.Method;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class AfterAdvice implements org.springframework.aop.AfterReturningAdvice{

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Advice call after execute the method");
    }


    
}
