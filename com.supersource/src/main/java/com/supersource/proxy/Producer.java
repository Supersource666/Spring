package com.supersource.proxy;

public class Producer  implements  IProducer{
    public void saleProduct(float money){
        System.out.println("销售收钱："+money);

    }


    public void afterSale(float money){
        System.out.println("售后"+money);
    }
}
