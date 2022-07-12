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
        if (distance %10 == 0)
            refuel(-50);
    }


}

public class PlaneTest {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("L747",1000);
        Cargoplane cargoplane = new Cargoplane("c40",1000);
        airplane.flight(100);
        cargoplane.flight(100);

        System.out.println(airplane);
        System.out.println(cargoplane);

        airplane.refuel(200);
        cargoplane.refuel(200);

    }
}
