package top.locoli.pattern.factory.factory_method;

/**
 * @description: 具体产品B
 */
class ConcreteProductB extends Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
}
