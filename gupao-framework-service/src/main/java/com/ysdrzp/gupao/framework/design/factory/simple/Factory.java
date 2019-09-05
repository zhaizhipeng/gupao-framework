package com.ysdrzp.gupao.framework.design.factory.simple;

/**
 * 简单工厂
 * @author zhipeng zhai
 */
public class Factory {

    /**
     * 场务取车
     * @param carType
     * @return
     */
    public ICar getCar(CarType carType){
        if (CarType.JeepCarType.equals(carType)){
            return new JeepCar();
        }else if (CarType.SportCarType.equals(carType)){
            return new SportCar();
        }else if (CarType.HatchbackCarType.equals(carType)){
            return new HatchbackCar();
        }else {
            throw new RuntimeException("场务没取到车");
        }
    }

}
