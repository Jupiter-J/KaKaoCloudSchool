package thread;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("실행이된다! ");
    }
}


public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run(); //위의 클래스로부터 파생된 새로운 메소드 run() 실행
        t.start(); //thread를 생성하고 stack을 할당받고 run()호출한다

        MyThread2 a = new MyThread2();
        Thread t1 = new Thread(a);
        t1.start();

        System.out.println("안녕하세요!");
    }
}
