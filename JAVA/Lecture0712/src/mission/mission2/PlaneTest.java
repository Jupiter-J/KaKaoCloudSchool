package mission.mission2;


class Airplane extends Plane{

    public Airplane(){
    }

    public Airplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {
        //10운항시 연료 30감소
        int s = distance/10;
        super.setFuelSize(getFuelSize()-30 *s);
    }

}

class Cargoplane extends Plane{

    public Cargoplane() {
    }

    public Cargoplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {
        //10운항시 연료 50감소
        int s = distance/10;
        super.setFuelSize(getFuelSize()-50 *s);
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

        airplane.refuel(200);
        cargoplane.refuel(200);
        System.out.println("Plane \t\t FuelSize");
        System.out.println("--------------------------");
        System.out.println(airplane.getPlaneName() + "\t\t" + airplane.getFuelSize());
        System.out.println(cargoplane.getPlaneName() +"\t\t\t" +cargoplane.getFuelSize());

    }
}
