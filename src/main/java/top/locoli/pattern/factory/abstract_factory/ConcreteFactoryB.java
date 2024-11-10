package top.locoli.pattern.factory.abstract_factory;

/**
 * @description: 具体工厂B类，负责创建具体产品A2和B2
 */
class ConcreteFactoryB implements AbstractFactory {
    // 创建并返回具体产品A2的实例
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    // 创建并返回具体产品B2的实例
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}