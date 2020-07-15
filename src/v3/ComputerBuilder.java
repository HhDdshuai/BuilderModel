package v3;

public interface ComputerBuilder {
    void setCpu();
    void setGpu();
    void setMemery();
    void setHd();
    Computer build();
}
