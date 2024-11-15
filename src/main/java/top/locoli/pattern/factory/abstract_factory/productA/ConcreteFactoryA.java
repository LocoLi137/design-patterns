package top.locoli.pattern.factory.abstract_factory.productA;

import top.locoli.pattern.factory.abstract_factory.AbstractFactory;
import top.locoli.pattern.factory.abstract_factory.productB.ProductB;

/**
 * @description: 具体工厂A类，负责创建具体产品A1和B1
 */
public class ConcreteFactoryA implements AbstractFactory {
    // 创建并返回具体产品A1的实例
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    // 创建并返回具体产品B1的实例
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}