package com.supersource.utils;

/**
 * 日志类，其内部有公共代码
 */
public class Logger {
    /**
     * 计划让其在切入点方法之前运行（切入点方法就是业务层的方法）
     */
    public void printLog(){
        System.out.println("Logger文件的printLog开始打印日志了。");
    }
}
