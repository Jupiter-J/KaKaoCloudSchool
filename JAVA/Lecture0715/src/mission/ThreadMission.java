package mission;

class thread1 extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("저는 thread1입니당 ");

            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

    }
}

class thread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("저는 thread2입니당 ");

            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
public class ThreadMission {
    public static void main(String[] args) {

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.start();
        t2.start();
        System.out.println("Main Thread 실행 - 안녕하세요 main Thread입니다");
    }
}
