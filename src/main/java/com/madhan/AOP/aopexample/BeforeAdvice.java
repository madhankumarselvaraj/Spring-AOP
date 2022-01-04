/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.AOP.aopexample;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class BeforeAdvice implements MethodBeforeAdvice {

@Override
public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println("Advice call before excute method");
}

}
