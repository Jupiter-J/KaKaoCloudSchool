package sleep;

class ThreadExam03_1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000); //현재실행하는 스레드를 재워라 => 메인스레드가 자는거
        }catch (Exception e){

        }for (int i=0; i<300; i++){
            System.out.print("-");
        }
        System.out.println("<<Thread 1 종료>>");
    }
}

class ThreadExam03_2 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<300; i++){
            System.out.print("|");
        }
        System.out.println("<<Thread 2 종료>>");
    }
}
public class ThreadExam03 {
    public static void main(String[] args) {
        ThreadExam03_1 t1 = new ThreadExam03_1();
        ThreadExam03_2 t2 = new ThreadExam03_2();

        t1.start();
        t2.start();
    }
}
