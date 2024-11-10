package top.locoli.pattern.factory.factory_method;

/**
 * @description: 具体工厂A
 */
class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
