package com.ysdrzp.gupao.framework.design.factory.method;

import org.junit.Test;

/**
 * 工厂方法测试类
 * @author zhipeng zhai
 * @date 2019/9/5 0005
 */
public class TestFactoryMethod {

    @Test
    public void test(){
        JeepCarFactory jeepCarFactory = new JeepCarFactory();
        ICar jeepCar = jeepCarFactory.createCar();
        jeepCar.joyRide();

        SportCarFactory sportCarFactory = new SportCarFactory();
        ICar sportCar = sportCarFactory.createCar();
        sportCar.joyRide();

        HatchbackCarFactory hatchbackCarFactory = new HatchbackCarFactory();
        ICar hatchbackCar = hatchbackCarFactory.createCar();
        hatchbackCar.joyRide();
    }
}
