package top.locoli.pattern.factory.simple_factory;

/**
 * @description: 产品B
 */
class ConcreteProductB extends Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
}
