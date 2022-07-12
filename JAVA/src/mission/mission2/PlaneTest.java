package mission.mission2;




abstract class Plane{
    private String planeName;
    private int fuelSize;

    public Plane() {
    }

    public Plane(String planeName, int fuelSize) {
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }

    //getter setter
    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getFuelSize() {
        return fuelSize;
    }

    public void setFuelSize(int fuelSize) {
        this.fuelSize = fuelSize;
    }

    public void fuel(int fuel){ //기존 연료가 증가
        //    this.fuelSize += fuel;  직접 access 지양하기
        this.setFuelSize(this.getFuelSize()+fuel);
    }

    //abstract method
    public abstract void flight(int distance);

}

class Airplane extends Plane{


    public Airplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) { //10운항시 연로 30 감소
        System.out.println(distance+"운항");
        int s = distance/10;
        super.setFuelSize(getFuelSize() -30 * s);
    }
}

class Cargoplane  extends Plane{

    public Cargoplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) { //10운항시 연료 50 감소
        System.out.println(distance+"운항");
        int s = distance/10;
        super.setFuelSize(getFuelSize() -50 *s);
    }
}


public class PlaneTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("L747",1000);
        Cargoplane cargoplane = new Cargoplane("C40",1000);

        System.out.println("Plane \t\t FuelSize");
        System.out.println("--------------------------");
        System.out.println(airplane.getPlaneName() +"\t\t" +airplane.getFuelSize());
        System.out.println(cargoplane.getPlaneName() +"\t\t\t" +cargoplane.getFuelSize());

        System.out.println();

        airplane.flight(100);
        cargoplane.flight(100);
        System.out.println("Plane \t\t FuelSize");
        System.out.println("--------------------------");
        System.out.println(airplane.getPlaneName() + "\t\t" + airplane.getFuelSize());
        System.out.println(cargoplane.getPlaneName() +"\t\t\t" +cargoplane.getFuelSize());
        System.out.println();

        airplane.fuel(200);
        cargoplane.fuel(200);
        System.out.println("Plane \t\t FuelSize");
        System.out.println("--------------------------");
        System.out.println(airplane.getPlaneName() + "\t\t" + airplane.getFuelSize());
        System.out.println(cargoplane.getPlaneName() +"\t\t\t" +cargoplane.getFuelSize());
    }
}
