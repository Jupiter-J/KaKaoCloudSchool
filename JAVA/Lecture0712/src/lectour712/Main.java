package lectour712;

// java Main => 실행
public class Main {
    public static void main(String[] args) {
        InstanceTest test =new InstanceTest(); //지역변수 선언
        System.out.println("3번");
        int k = InstanceTest.myCall("4번");
        test = new InstanceTest();
        test.printMsg("5번");
    }
}
