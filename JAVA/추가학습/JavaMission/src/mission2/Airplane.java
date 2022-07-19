package mission2;

public abstract class Airplane { //추상클래스는 인스턴스 생성이 불가능하다!
    private String planeName;
    private int fuelSize;

    public Airplane() {
    }

    public Airplane(String planeName, int fuelSize) {
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }

    public void refuel(int fuel){ //주유
        //fuelSize += fuel;
        this.setFuelSize(this.getFuelSize()+fuel);
        System.out.println(getPlaneName() + "\t" + getFuelSize());
    }

    public abstract void flight(int distance); //추상 메소드가 하나라도 있으면 추상클래스!

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

    @Override
    public String toString() {
        return getPlaneName() + "\t" + getFuelSize();
    }
}
