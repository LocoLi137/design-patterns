package top.locoli.pattern.factory.factory_method;

/**
 * @description: 客户端类，用于测试工厂方法模式
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体工厂A并生产具体产品A
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.use();

        // 创建具体工厂B并生产具体产品B
        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.use();
    }
}
