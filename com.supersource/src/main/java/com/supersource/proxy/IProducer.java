package com.supersource.proxy;

public interface IProducer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);
    /**
     * 售后
     * @param money
     */
    public void afterSale(float money);
}
