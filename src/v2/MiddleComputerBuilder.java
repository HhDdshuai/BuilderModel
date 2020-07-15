package v2;

/**
 * 电脑建造者类，建造者类，必须关联电脑产品
 * 关联：一个类的对象，作为另一个类的对象
 */
public class MiddleComputerBuilder {
    private Computer computer = new Computer();

    public Computer build(){
        computer.setCpu("i7 7700hq");
        computer.setGpu("gtx1060");
        computer.setMemery("16G");
        computer.setHd("256ssd + 1T机械");
        return computer;
    }
}
