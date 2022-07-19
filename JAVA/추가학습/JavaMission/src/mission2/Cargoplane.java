package mission2;

public class Cargoplane extends Airplane{

    public Cargoplane() {
    }

    public Cargoplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {
        int r = distance /10;
        setFuelSize(getFuelSize()-r*50 );
        System.out.println(getPlaneName() + "\t" + getFuelSize());
    }
}
