package basic;

public class Student3 {
    /** filed 변수들 **/
    static int a = staticCall("1번");
    int b = staticCall("2번"); //공간이 먼저 만들어지고

    /** Constructor 생성자들*/
    public Student3(){
        this.b = staticCall("3번"); //초기화된다
    }

    /** methods 메소드들*/
   public static int staticCall(String msg){
       System.out.println(msg);
       return 100;
   }
    public static void main(String[] args) {
        System.out.println("4번");
        int c = staticCall("5번");
        Student3 s = new Student3();
    }
}
