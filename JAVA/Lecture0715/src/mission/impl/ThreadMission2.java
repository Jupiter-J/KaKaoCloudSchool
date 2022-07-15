package mission.impl;

class pairArea{

    public synchronized void printNum(){
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

class makeThread implements Runnable {
    pairArea area = new pairArea();

    @Override
    public void run() {
       //shared.run();
    }
}
public class ThreadMission2 {
    public static void main(String[] args) {
        makeThread r = new makeThread();
        Thread t1 = new Thread(r, "첫번째 Thread");
        Thread t2 = new Thread(r, "두번째 Thread");

        t1.start();
        t2.start();
        System.out.println("main Thread start");
    }
}
