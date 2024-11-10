package top.locoli.pattern.factory.abstract_factory;

import top.locoli.pattern.factory.abstract_factory.productA.ProductA;
import top.locoli.pattern.factory.abstract_factory.productB.ProductB;

/**
 * @description: 抽象工厂接口，定义创建产品族的方法
 */
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}