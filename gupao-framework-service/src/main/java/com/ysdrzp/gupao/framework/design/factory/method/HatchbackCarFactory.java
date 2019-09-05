package com.ysdrzp.gupao.framework.design.factory.method;

/**
 * 两厢车工厂类
 * @author zhipeng zhai
 * @date 2019/9/5 0005
 */
public class HatchbackCarFactory implements IFactory{

    public ICar createCar() {
        return new HatchbackCar();
    }
}
