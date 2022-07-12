package lectour712;

public class MyClass {
    //필드
    int aaa;
    static int bbb = staticCall();

    //default 생성자는 꼭 써주기
    public MyClass(){

    }

    //static block
    //메인메서드가 실행되기 직전에 프로그램에서 필요한 라이브러리같은것들을 로딩할 필요가 있을때 사용한다
    static{
        System.out.println("static block!");
    }

    //메서드
    static int staticCall(){
        System.out.println("staticCall 호출되었어요!");
        return 100;
    }

    public static void main(String[] args) {
        System.out.println("main 호출");
    }
}
