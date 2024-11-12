package top.locoli.pattern.builder;

/**
 * @description: 指挥者类，用于管理构建流程
 */
class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
        return builder.getResult();
    }
}