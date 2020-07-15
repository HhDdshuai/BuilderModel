package v4;

public class Director {
    public Computer build(ComputerBuilder cb){
        cb.setCpu();
        cb.setGpu();
        cb.setMemery();
        cb.setHd();
        return cb.build();
    }
}
