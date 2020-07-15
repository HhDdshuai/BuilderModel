package v1;

/**
 * 电脑建造者类，建造者类，必须关联电脑产品
 * 关联：一个类的对象，作为另一个类的对象成员
 */
public class ComputerBuilder {
    private Computer computer = new Computer();

    public Computer build(){
        computer.setCpu("i7 8750HK");
        computer.setGpu("RTX2080");
        computer.setMemery("32G");
        computer.setHd("512ssd + 2T机械");
        return computer;
    }
}
