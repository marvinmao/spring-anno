package com.llnqdx.spring.anno.cap10.aop;
/**
 * Copyright 2017-2025 Evergrande Group.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 日志切面类的方法需要动态感知到div()方法运行到哪里了, 然后再执行, 如果除法开始, 就日志开始方法,
 * 也叫通知方法, 分以下几种:
 * 前置通知: logStart(),在目标方法(div)运行之前运行 (@Before)
 * 后置通知:logEnd(), 在目标方法(div)运行结束之后运行,无论正常或异常结束 (@After)
 * 返回通知:logReturn, 在目标方法(div)正常返回之后运行 (@AfterReturning)
 * 异常通知:logException, 在目标方法(div)出现异常后运行(@AfterThrowing)
 * 环绕通知:以上没写,动态代理, 手动执行目标方法运行joinPoint.procced(),最底层通知,手动指定执行目标方法(@Around), (执行之前相当于前置通知, 执行之后相当于返回通知)
 * 其实就是通过反射执行目标对象的连接点处的方法；
 * <p>
 * 给日志切面类LogAspect的方法标注何时运行(即通知注解)
 * <p>
 * <p>
 * 总结：
 * AOP看起来很麻烦, 只要3步就可以了:
 * 1,将业务逻辑组件和切面类都加入到容器中, 告诉spring哪个是切面类(@Aspect)
 * 2,在切面类上的每个通知方法上标注通知注解, 告诉Spring何时运行(写好切入点表达式,参照官方文档)
 * 3,开启基于注解的AOP模式  @EableXXXX
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.llnqdx.spring.anno.cap10.aop.Calculator.*(..))")
    public void pointCut() {

    }

    // 不区分方法，多个参数加..
    //@Before("execution(public int com.llnqdx.spring.anno.cap10.aop.Calculator.*(..))")
    //@Before("execution(public int com.llnqdx.spring.anno.cap10.aop.Calculator.div(int, int))")
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("joinPoint.getSignature().getName() {" + joinPoint.getSignature().getName() + "}" +
                ", the method div start ..." +
                ", joinPoint.getArgs() {" + Arrays.asList(joinPoint.getArgs()) + "}");
    }

    //@After("execution(public int com.llnqdx.spring.anno.cap10.aop.Calculator.*(..))")
    @After("com.llnqdx.spring.anno.cap10.aop.LogAspects.pointCut()")
    public void logEnd() {
        System.out.println("the method div end ...");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("the method div return ... result is {" + result + "} ");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("the method div exception ... exception is {" + exception + "}");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around : do target method before ...");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("@Around : do target method after ...");
        return obj;
    }
}
