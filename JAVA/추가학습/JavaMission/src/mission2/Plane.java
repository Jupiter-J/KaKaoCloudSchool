package mission2;

public class Plane extends Airplane{

    public Plane() {
    }

    public Plane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {
        int r = distance /10;
        setFuelSize(getFuelSize()-r*30 );
        System.out.println(getPlaneName() + "\t" + getFuelSize());
    }
}
