package top.locoli.pattern.builder;

/**
 * @description: 具体建造者类，为高性能电脑实现构建过程
 */
class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("High-end CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("32GB RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}