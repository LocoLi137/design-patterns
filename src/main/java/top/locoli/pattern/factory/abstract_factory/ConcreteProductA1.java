package top.locoli.pattern.factory.abstract_factory;

/**
 * @description: 具体产品A1类，实现ProductA接口
 */
class ConcreteProductA1 implements ProductA {
    // 使用具体产品A1
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA1");
    }
}
