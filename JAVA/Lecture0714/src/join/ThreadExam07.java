package join;


class ThreadEx_07_1 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<300; i++){
            System.out.print("-");
        }
    }
}
class ThreadEx_07_2 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<300; i++){
            System.out.print("|");
        }
    }

}
public class ThreadExam07 {
    public static void main(String[] args) {

        //두개의 스레드 생성
        Thread t1 = new ThreadEx_07_1();
        Thread t2 = new ThreadEx_07_2();

        //둘다 runnable 상태로 넣는다
        //스케줄러가 내부적인 메커니즘으로 선택을 하여 실행시킨다 -> 누가 될지 모름
        //스레드 큐에 들어가 튕겨나옴 우리는 알수 없다
        t1.start();
        t2.start();

        //main, t1, t2 3개가 돌고있는 상황
        try {
            //main스레드가 멈추고 t1을 참여시킨다
            t1.join();
            //main스레드가 제일 뒤로 밀린다
            t2.join();
        }catch (Exception e){
        }
        //위의 명령문이 아니었다면 main이 제일먼저 끝났을 것이다
        //join이 들어가면서 t1, t2가 먼저 수행
        System.out.println("<<main 종료>>");

    }
}
