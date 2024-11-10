package top.locoli.pattern.factory.simple_factory;

/**
 * @description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();

        Product productB = SimpleFactory.createProduct("B");
        productB.use();
    }
}
