package v2;

/**
 * 电脑建造者类，建造者类，必须关联电脑产品
 * 关联：一个类的对象，作为另一个类的对象
 */
public class AdvancedComputerBuilder {
    private Computer computer = new Computer();

    public Computer build(){
        computer.setCpu("i7 8750HK");

        computer.setMemery("32G");
        computer.setHd("512ssd + 2T机械");
        return computer;
    }
}
