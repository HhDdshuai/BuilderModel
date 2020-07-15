package v3;

/**
 *
 */
public class MiddleComputerBuilder implements ComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public void setCpu() {
        computer.setCpu("i7 7700hq");
    }

    @Override
    public void setGpu() {
        computer.setGpu("gtx1060");
    }

    @Override
    public void setMemery() {
        computer.setMemery("16G");
    }

    @Override
    public void setHd() {
        computer.setHd("256ssd + 1T机械");
    }

    public Computer build(){
        return computer;
    }
}
