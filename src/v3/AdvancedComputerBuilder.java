package v3;

/**
 *
 */
public class AdvancedComputerBuilder implements ComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public void setCpu() {
        computer.setCpu("i7 8750HK");
    }

    @Override
    public void setGpu() {
        computer.setGpu("RTX2080");
    }

    @Override
    public void setMemery() {
        computer.setMemery("32G");
    }

    @Override
    public void setHd() {
        computer.setHd("512ssd + 2T机械");
    }

    public Computer build(){
        return computer;
    }
}
