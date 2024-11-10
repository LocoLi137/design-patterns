package top.locoli.pattern.factory.abstract_factory;

/**
 * @description: 具体产品B2类，实现ProductB接口
 */
class ConcreteProductB2 implements ProductB {
    // 使用具体产品B2
    @Override
    public void eat() {
        System.out.println("Eating ConcreteProductB2");
    }
}