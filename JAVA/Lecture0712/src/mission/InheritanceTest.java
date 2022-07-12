package mission;

//상위클래스
    class Supperclass{
    //static Method
        static int staticCall(String msg){
            System.out.println(msg);
        return 100;
        }

        //fields
        int a = staticCall("1번 입니다");
        static int b = staticCall("2번 입니다");

        //constructor
        public Supperclass(){
            staticCall("3번 입니다");
        }

        public Supperclass(int i){
            this();//자신의 다른 생성자 호출(인자가없는)
            staticCall("4번 입니다");
        }

        //method
        public void myFunc(){
            System.out.println("5번 입니다");
        }

    }
    public class InheritanceTest extends Supperclass{
        //fields
        int c = staticCall("6번 입니다");
        static int d =  staticCall("7번 입니다");

        //constructor
        public InheritanceTest(){
            super(100);
            staticCall("8번 입니다");
            super.myFunc();
        }

        @Override
        public void myFunc() {
            System.out.println("9번 입니다");
        }

        public static void main(String[] args) {
            System.out.println("10번 입니다");
            Supperclass obj = new InheritanceTest();
            obj.myFunc();
            //객체에 대한 type이 상위타입이라 할지라도 만약 overriding된 method에 하위에 존재한다면 method는 overriding된 method를 사용한다 동적바인딩
        }
    }
