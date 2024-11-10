package top.locoli.pattern.factory.abstract_factory.productB;

import top.locoli.pattern.factory.abstract_factory.productA.ProductA;

/**
 * @description: 具体产品A2类，实现ProductA接口
 */
class ConcreteProductA2 implements ProductA {
    // 使用具体产品A2
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA2");
    }
}