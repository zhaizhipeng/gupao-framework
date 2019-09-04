package com.ysdrzp.gupao.framework.service.design.factory;

/**
 * 具体产品-两箱车
 * @author zhipeng zhai
 */
public class HatchbackCar implements ICar {
    
    public void getCar() {
        System.out.println("场务拿到两箱车");
    }
}
