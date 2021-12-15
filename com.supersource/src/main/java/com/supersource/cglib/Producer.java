package com.supersource.cglib;

import com.supersource.proxy.IProducer;

public class Producer
    {
    public void saleProduct(float money){
        System.out.println("销售收钱："+money);

    }


    public void afterSale(float money){
        System.out.println("售后"+money);
    }
}
