package top.locoli.pattern.factory.factory_method;

/**
 * @description: 具体产品A
 */
class ConcreteProductA extends Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}
