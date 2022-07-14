package stop;

class ThreadEx_05 implements Runnable{

    @Override
    public void run() {

        while(true){ //무한루프       //현재 실행중인 스레드를찾기
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);  //1초잤다가 깨고 자기이름 찍음
            }catch (Exception e){          // 스레드 1개가 쉬니까 남은 2스레드실행

            }
        }

    }
}
public class ThreadExam05 {
    public static void main(String[] args) {
        //runnable 객체임 아직 스레드 구현되지 않았다.
        ThreadEx_05 r = new ThreadEx_05();
        Thread t1 = new Thread(r, "*"); //두번째 인자는 스레드의 이름을 지어 줄 수 있다
        Thread t2 = new Thread(r, "**");
        Thread t3 = new Thread(r, "***"); //동일한 작업을 하는 스레드를 3개 생성

        t1.start();
        t2.start();
        t3.start();  //runnable이 스케줄러에 의해 랜덤으로 스레드를 선택해서 작동시킨다

        try {
            Thread.sleep(2000); //메인 스레드를 재운다
            t1.suspend(); //t1을 일시 중지
            Thread.sleep(2000);
            t2.suspend(); //t2을 일시 중지
            Thread.sleep(2000);
            t1.resume(); //t1이 다시 동작하도록 설정
            t1.stop();
            t2.stop();
            Thread.sleep(2000);
            t3.stop();
        }catch (Exception e){

        }
    }
}
