package top.locoli.pattern.factory.abstract_factory;

import top.locoli.pattern.factory.abstract_factory.config.ConfigFactory;
import top.locoli.pattern.factory.abstract_factory.productA.ProductA;
import top.locoli.pattern.factory.abstract_factory.productB.ProductB;

/**
 * @description: 客户端类，用于测试抽象工厂模式
 */
public class Client {
    public static void main(String[] args) {
//        // 使用具体工厂A创建产品族A
//        AbstractFactory factoryA = new ConcreteFactoryA();
//        ProductA productA1 = factoryA.createProductA();
//        ProductB productB1 = factoryA.createProductB();
//        productA1.use();
//        productB1.eat();
//
//        // 使用具体工厂B创建产品族B
//        AbstractFactory factoryB = new ConcreteFactoryB();
//        ProductA productA2 = factoryB.createProductA();
//        ProductB productB2 = factoryB.createProductB();
//        productA2.use();
//        productB2.eat();
        test_config("ConcreteProductA1");
    }

    public static void test_config(String className){
        AbstractFactory factory = ConfigFactory.getFactory();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.use();
        productB.eat();
    }
}