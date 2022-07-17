package thread3;

public class ThreadExam2 implements Runnable
{
    static boolean autoSave = false;
    public static void main(String[] args) { //메인스레드는 이미 실행중!
        Thread t = new Thread(new ThreadExam2());
        t.setDaemon(true);
        t.start(); //t 스레드 실행

        for (int i = 0; i < 10; i++) {
        try {
            Thread.sleep(1000); //메인 스레드를 1초 재운다
        } catch (Exception e) {
        }
        System.out.println(i);
        if(i==5) {
            autoSave = true; //데몬 실행
            }
        }
    }
    @Override
    public void run() {
        while (true){ //t 스레드는 계속 실행
            try {
                Thread.sleep(3000); //t 스레드는 3초동안 재움
            }catch ( InterruptedException e){
            }
            if (autoSave){
                System.out.println("자동저장되었어요!");
            }
        }
    }
}
