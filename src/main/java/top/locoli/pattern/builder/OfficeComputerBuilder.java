package top.locoli.pattern.builder;

/**
 * @description: 具体建造者类，为办公电脑实现构建过程
 */
class OfficeComputerBuilder implements Builder {
    private Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.setCPU("Mid-range CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
