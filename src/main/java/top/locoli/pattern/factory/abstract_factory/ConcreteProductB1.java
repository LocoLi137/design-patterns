package top.locoli.pattern.factory.abstract_factory;

/**
 * @description: 具体产品B1类，实现ProductB接口
 */
class ConcreteProductB1 implements ProductB {
    // 使用具体产品B1
    @Override
    public void eat() {
        System.out.println("Eating ConcreteProductB1");
    }
}