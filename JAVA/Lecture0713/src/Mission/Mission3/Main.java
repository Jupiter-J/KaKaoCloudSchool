package Mission.Mission3;

abstract class Computer{
    private String name;
    private int cpu;
    private int memory;
    private int battery;

    public Computer() {
    }

    public Computer(String name, int cpu, int memory, int battery) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
        this.battery = battery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
       return this.getName() +"\t" + this.getCpu() + "\t" +this.getMemory() + "\t" + this.getBattery();
    }

    //abstract method
    public abstract void operate(int time);
}

interface Graphic{
    public double rendering(int size);
}

class Laptop extends Computer implements Graphic{
    Laptop(){
    }

    public Laptop(String name, int cpu, int memory, int battery) {
        super(name, cpu, memory, battery);
    }

    @Override
    public void operate(int time) {
        int s = time/10;
        super.setBattery(getBattery()-1 *s);
        //일정 시간 사용
   }

    @Override
    public double rendering(int size) {
        //특정 이미지 랜더링 처리시간 리턴
        return (double)size/(getCpu()*getMemory())*20 ;
    }

}

class Tab extends Computer implements Graphic{

    Tab(){
    }

    public Tab(String name, int cpu, int memory, int battery) {
        super(name, cpu, memory, battery);
    }

    @Override
    public void operate(int time) {
        //일정시간 사용
        int s = time/5;
        super.setBattery(getBattery()-1 *s);
    }

    @Override
    public double rendering(int size) {
        //특정 이미지 랜더링 처리
        return (double)size/(getCpu()*getMemory())*20 ;
    }

}

public class Main {
    public static void main(String[] args) {
        Computer arrays [] = new Computer[4];
        arrays[0] = new Laptop("Lap01",2,1024,2000);
        arrays[1] = new Laptop("Lap02",3,2048,2300);
        arrays[2] = new Tab("Tab01",2,1024,1200);
        arrays[3] = new Tab("Tab02",3,2048,1300);

// 배열을 뽑는것
//        System.out.println(Arrays.toString(arrays));

        System.out.println("name  cpu   memory battery ");
        System.out.println("----------------------------");
//        for(Computer x:arrays){
//            System.out.println(x.toString());
//        }

        for(Computer c:arrays){
            System.out.println(c);;
        }

        for(Computer c:arrays){
            c.operate(55);
        }

        System.out.println();

        for(Computer c : arrays){
            System.out.println(c.toString() +
                    " " + String.format("%.2f", ((Graphic)c).rendering(100)));
        }


    }
}
