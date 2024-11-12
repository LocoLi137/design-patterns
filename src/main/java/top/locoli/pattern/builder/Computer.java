package top.locoli.pattern.builder;

/**
 * @description: 产品类，表示一个复杂的电脑对象
 */
class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void showSpecifications() {
        System.out.println("Computer Specifications: ");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
    }
}
