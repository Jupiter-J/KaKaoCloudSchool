package stop_another;



class ThreadEx_06 implements Runnable{
        //멀티코어 환경에서 캐시가 아닌 메인 메모리에서 값을 불러오겠다는게 volatile이다
    volatile boolean suspended = false;  //일시정지 되었니?
    volatile boolean stopped = false; //중지되었니?

    @Override
    public void run() {
        //위의 변수 2개를 이용해서
        //멈추지 않으면 계속 돌아라
        while(!stopped){
            //일시멈춤이 아니라면
            if (!suspended){      //실행중인 스레드 호출
                System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e) {

            }
            }else {
                Thread.yield();
            }
        }
    }

    public void suspend(){
        suspended = true;
    }

    public void stop(){
        //stop이 호출되면 true가 떠서 while문이 멈추게된다
        stopped = true;
    }
    public void resume(){
        suspended = false; //일시정리된것을 다시 실행시킨다
    }

}
public class ThreadExam06 {
    public static void main(String[] args) {
        ThreadEx_06 r1 = new ThreadEx_06(); //runnable 3개
        ThreadEx_06 r2 = new ThreadEx_06();
        ThreadEx_06 r3 = new ThreadEx_06();
        Thread t1 = new Thread(r1, "*"); //thread 3개
        Thread t2 = new Thread(r2, "**");
        Thread t3 = new Thread(r3, "***"); //동일한 작업을 하는 스레드를 3개 생성

        t1.start();
        t2.start();
        t3.start();  //runnable이 스케줄러에 의해 랜덤으로 스레드를 선택해서 작동시킨다

        try {
            Thread.sleep(2000); //메인 스레드를 재운다
            r1.suspend(); //t1을 일시 중지
            Thread.sleep(2000);
            r2.suspend(); //t2을 일시 중지
            Thread.sleep(2000);
            r1.resume(); //t1이 다시 동작하도록 설정
            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();
        }catch (Exception e){

        }
    }
}
