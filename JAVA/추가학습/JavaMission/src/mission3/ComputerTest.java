package mission3;

public class ComputerTest {
    public static void main(String[] args) {
        // 모든 객체를 생성하여 arrays에 순서대로 넣는다
        Computer arrays [] =new Computer[4];
        arrays[0] = new Laptop("Lap01",2,1024,2000);
        arrays[1] = new Laptop("Lap02",3,2048,2300);
        arrays[2] = new Tab("Tab01",2,1024,1200);
        arrays[3] = new Tab("Tab02",3,2048,1300);
        // 모든 객체의 기본 정보를 출력한다
        System.out.println("name" + "\t" + "cpu" + "\t" + "memory" + "\t" + "battery");
        System.out.println("-----------------------------------------");
        for (Computer x : arrays){
            System.out.println(x);;
        }

        System.out.println();

        // 모든 컴퓨터를 55씩 사용을 한 배터리의 변화 내용과 모든 객체에
        // size가 100인 이미지를 렌더링 하는데 걸리는 시간을 출력한다
        System.out.println("name" + "\t" + "cpu" + "\t" + "memory" + "\t" + "battery" + "\t" + "rendering");
        System.out.println("-----------------------------------------");
        for (Computer x : arrays){
            x.operate(55);
            //렌더링 적용을 어떻게 해야할까?
            System.out.println(x + "\t" + String.format("%.2f",((Graphic)x).rendering(100)));
        }

    }
}
