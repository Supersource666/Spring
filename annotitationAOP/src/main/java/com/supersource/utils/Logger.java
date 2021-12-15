package com.supersource.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 日志类，其内部有公共代码
 */
@Component("logger")
@Aspect//表示当前类为切面类
public class Logger {
    @Pointcut("execution(* com.supersource.service.impl.*.*(..))")
    private void pt1() {

    }

    /**
     * 计划让其在切入点方法之前运行（切入点方法就是业务层的方法）
     */
   // @Before("pt1()")
    public void beforePrintLog(){
        System.out.println("前置通知Logger文件的beforePrintLog开始打印日志了。");
    }
    //@AfterThrowing("pt1()")
    public void afterThrowingPrintLog(){
        System.out.println("异常通知Logger文件的afterThrowingPrintLog开始打印日志了。");
    }
    //@AfterReturning("pt1()")
    public void afterReturningPrintLog(){
        System.out.println("后置通知Logger文件的afterReturnPrintLog开始打印日志了。");
    }
  // @After("pt1()")
    public void afterPrintLog(){
        System.out.println("最终通知Logger文件的afterPrintLog开始打印日志了。");
    }

    /**
     * 环绕通知的
     *  问题：当我们配置了环绕通知之后，切入点方法没有运行，而通知方法执行
     *  对比动态代理中环绕通知，发现动态代理的环绕通知有明确的切入点方法调用，而我们的没有
     *  解决办法：调用spring环绕通知解释
     *      spring框架为我们提供了一个接口ProceedingJoinPoint：该接口有一个proceed()方法，该方法相当于明确调用切入点方法
     *      该接口可以作为环绕通知的方法参数
     *   环绕通知   spring框架为我们提供的一种
     * @return
     */
    @Around("pt1()")
    public Object aroundPrintLog(ProceedingJoinPoint pjp){

        Object rtValue=null;

        try {
            Object[]  args=pjp.getArgs();
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了 前置");
            pjp.proceed(args);
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了 后置");
            return rtValue;
        } catch (Throwable e) {
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志了 异常");
            throw new RuntimeException(e);
        } finally {
            System.out.println("环绕通知Logger文件的aroundPrintLog开始打印了 最终");
        }


    }
}
