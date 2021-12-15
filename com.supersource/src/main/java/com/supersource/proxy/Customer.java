package com.supersource.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Customer {
    public static void main(String[] args) {
        /**
         * proxy作用：
         *  属性:
         */
        final Producer producer= new Producer();
        //用Proxy动态代理

        IProducer proxyProducer=(IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),producer.getClass().getInterfaces(),
                new InvocationHandler(){
                    /**
                     *
                     * @param proxy 代理对象的引用
                     * @param method 当前执行方法
                     * @param args 执行当前方法所需的参数
                     * @return 和被代理对象返回相同参数
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
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
        proxyProducer.saleProduct(10000f);
    }
}
