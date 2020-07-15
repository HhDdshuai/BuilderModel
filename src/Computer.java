public class Computer{
    private String cpu;
    private String gpu;
    private String memery;
    private String hd;
    /*
     * ................
     * */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMemery() {
        return memery;
    }

    public void setMemery(String memery) {
        this.memery = memery;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memery='" + memery + '\'' +
                ", hd='" + hd + '\'' +
                '}';
    }
}