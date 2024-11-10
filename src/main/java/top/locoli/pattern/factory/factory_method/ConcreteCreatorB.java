package top.locoli.pattern.factory.factory_method;

/**
 * @description: 具体工厂B类，实现工厂方法创建具体产品B
 */
class ConcreteCreatorB extends Creator {
    // 创建并返回具体产品B的实例
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
