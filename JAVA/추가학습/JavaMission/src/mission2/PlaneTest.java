package mission2;

public class PlaneTest {
    public static void main(String[] args) {
        //Airplane과 Cargoplane 객체 생성
            Plane plane = new Plane("L747",1000);
            Cargoplane cargoplane = new Cargoplane("C40",1000);

        // 생성된 객체의 정보 출력
        System.out.println("Plane" + "\t" + "FuelSize" + "\n" + "-----------------------");
        System.out.println(plane.toString());
        System.out.println(cargoplane.toString());
        System.out.println();

        // Airplane과 Cargoplane 객체에 100씩 운항
        System.out.println("Plane" + "\t" + "FuelSize" + "\n" + "-----------------------");
        plane.flight(100);
        cargoplane.flight(100);
        System.out.println();

        //Airplane과 Cargoplane 객체에 200씩 주유
        System.out.println("Plane" + "\t" + "FuelSize" + "\n" + "-----------------------");
        plane.refuel(200);
        cargoplane.refuel(200);

    }
}
