package top.locoli.pattern.builder;

public class Client {
    public static void main(String[] args) {
        // 构建高性能游戏电脑
        Builder gamingBuilder = new GamingComputerBuilder();
        Director director = new Director(gamingBuilder);
        Computer gamingComputer = director.construct();
        gamingComputer.showSpecifications();

        // 构建办公电脑
        Builder officeBuilder = new OfficeComputerBuilder();
        director = new Director(officeBuilder);
        Computer officeComputer = director.construct();
        officeComputer.showSpecifications();
    }
}