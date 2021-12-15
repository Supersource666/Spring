package com.supersource.cglib;

import com.supersource.proxy.IProducer;
import com.supersource.proxy.Producer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Customer {
    public static void main(String[] args) {
        final Producer producer= new Producer();
       Producer cglibproducer=(Producer) Enhancer.create(producer.getClass(),new MethodInterceptor(){
            /**
             * 执行此代理方法的对象均会经过此方法
             * @param proxy
             * @param method
             * @param args
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                //提供增强代码
                Object returnValue=null;
                //获取当前方法所需参数
                Float money=(Float)args[0];
                //判断当前方法是销售
                if("saleProduct".equals(method.getName())){
                    returnValue=method.invoke(producer,money*0.8f);
                }
                return returnValue;
            }
        });
       cglibproducer.saleProduct(12000f);
    }
}
