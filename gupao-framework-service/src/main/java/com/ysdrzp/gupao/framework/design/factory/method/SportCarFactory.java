package com.ysdrzp.gupao.framework.design.factory.method;

/**
 * 跑车工厂类
 * @author zhipeng zhai
 */
public class SportCarFactory implements IFactory{

    public ICar createCar() {
        return new SportCar();
    }
}
