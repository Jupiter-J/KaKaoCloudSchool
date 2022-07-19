package mission3;

public class Laptop extends Computer implements Graphic{

    public Laptop() {
    }

    public Laptop(String name, int cpu, int memory, int battery) {
        super(name, cpu, memory, battery);
    }

    @Override
    public void operate(int time) {
        int r = time/10;
        setBattery(getBattery()-1*r);
    }

    @Override
    public double rendering(int size) {
        return (double) size/(getCpu()*getMemory())*20;
    }
}
