package top.locoli.pattern.factory.simple_factory;

/**
 * @description: 产品A
 */
class ConcreteProductA extends Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}
