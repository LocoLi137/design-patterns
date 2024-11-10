package top.locoli.pattern.factory.abstract_factory.config;

import top.locoli.pattern.factory.abstract_factory.AbstractFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @description:
 */
public class ConfigFactory {
    private static Properties properties = new Properties();

    static {
        Properties p = new Properties();

        try (InputStream is = new FileInputStream("D:/code/java/design-patterns/src/main/resources/factory-config.properties");)
        {
            p.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AbstractFactory getFactory() {
        String factoryClassName = properties.getProperty("ConcreteProductA1");
        try {
            // 使用反射动态创建具体工厂实例
            return (AbstractFactory) Class.forName(factoryClassName).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create factory: " + factoryClassName, e);
        }
    }
}
