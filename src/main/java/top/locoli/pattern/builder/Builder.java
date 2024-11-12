package top.locoli.pattern.builder;

interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}