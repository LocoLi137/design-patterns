package top.locoli.pattern.factory.abstract_factory;

/**
 * @description: 抽象工厂接口，定义创建产品族的方法
 */
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}