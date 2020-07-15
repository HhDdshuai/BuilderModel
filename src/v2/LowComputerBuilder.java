package v2;

/**
 * 电脑建造者类，建造者类，必须关联电脑产品
 * 关联：一个类的对象，作为另一个类的对象
 */
public class LowComputerBuilder {
    private Computer computer = new Computer();

    public Computer build(){
        computer.setCpu("i5 7500u");
        computer.setGpu("gtx940mx");
        computer.setMemery("8G");
        computer.setHd("1T机械");
        return computer;
    }
}
