package v3;

/**
 *
 */
public class LowComputerBuilder implements ComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public void setCpu() {
        computer.setCpu("i5 7500u");
    }

    @Override
    public void setGpu() {
        computer.setGpu("gtx940mx");
    }

    @Override
    public void setMemery() {
        computer.setMemery("8G");
    }

    @Override
    public void setHd() {
        computer.setHd("1T机械");
    }

    public Computer build(){
        return computer;
    }
}
