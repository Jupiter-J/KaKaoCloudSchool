package re;

public class InstanceTest {

    //feilds - 1
    int a= myCall("1번출력");
    static int b = myCall("2번출력");
    //constructor -2
    public InstanceTest(){
    }
    //method -3
    public static int myCall(String msg){
        System.out.println(msg);
        return 100;
    }
    public void printMsg(String msg){
        int a = 100;
        System.out.println(msg);
    }
}
