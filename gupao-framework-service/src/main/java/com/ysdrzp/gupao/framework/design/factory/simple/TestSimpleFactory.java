package com.ysdrzp.gupao.framework.design.factory.simple;

import org.junit.Test;

import javax.swing.*;

/**
 * 简单工厂测试
 * @author zhipeng zhai
 */
public class TestSimpleFactory {

    @Test
    public void test(){
        Factory factory = new Factory();
        ICar jeepCar = factory.getCar(CarType.JeepCarType);
        jeepCar.joyRide();
        ICar sportCar = factory.getCar(CarType.SportCarType);
        sportCar.joyRide();
        ICar hatchbackCar = factory.getCar(CarType.HatchbackCarType);
        hatchbackCar.joyRide();
        ICar car = factory.getCar(null);
    }
}
