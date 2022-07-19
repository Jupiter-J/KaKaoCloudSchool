package mission3;

public class Tab extends Computer implements Graphic{

    public Tab() {
    }

    public Tab(String name, int cpu, int memory, int battery) {
        super(name, cpu, memory, battery);
    }

    @Override
    public void operate(int time) {
        int r = time/5;
        setBattery(getBattery()-1*r);
    }

    @Override
    public double rendering(int size) {
        return  (double) size/(getCpu()*getMemory())*30;
    }


}
