package thread2;

class ThreadEX_01_1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(this.getName());
        }
    }
}

class ThreadEx_01_2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());  //runabl로부터 구현한거지 아직 스레드가 아니다!
                                    //현재 실행중인  스레드 실행
        }
    }
}
public class ThreadExam01 {
    public static void main(String[] args) {
        ThreadEX_01_1 t1 = new ThreadEX_01_1();
        ThreadEx_01_2 r = new ThreadEx_01_2();
        Thread t2 = new Thread(r);

        //싱글코어일경우 우선순위를 지정해주는게 좋지만 멀티코어 환경에서는 의미가 없다
 //       t1.setPriority(10);
 //       t2.setPriority(2);

        t1.start();
        t2.start();
        System.out.println("main thread 종료");
    }
}
