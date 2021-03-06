package interrupt;

import javax.swing.*;

class ThreadEx_04 extends Thread{
    @Override
    public void run() {
        int i= 10;
        while (i != 0 && !isInterrupted() ){
            //i=0이면 튕겨나간다
            System.out.println(--i);
            try{
                Thread.sleep(3000); //제대로 실행되지 않는다 -> 계속 스레드가 돌아감
            }catch (Exception e){
                interrupt(); //그래서 한번더 재재를 해야한다
            }
        }
        System.out.println("카운트가 종료되었어요!");
    }
}
public class ThreadExam04 {
    public static void main(String[] args) {

        Thread t = new ThreadEx_04();
        t.start();

        //Swing에 있는 옵션펜 - 입력할수 있는 창이 생성된다 -> 입력값이 프로그래밍한테 전달된다
        //값을 입력할때까지 메인 스레드가 멈추게된다
        String input = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력값은 :" + input);
        t.interrupt();
        //Thread t의 interrupted 상태가 true가 된다
        System.out.println("Thread의 상태값은 :" + t.isInterrupted());
    }
}
