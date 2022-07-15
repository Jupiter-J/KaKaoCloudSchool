package thread_synchronization;

//Thread에 의해서 공유되는 공유 객체를 생성하기 위한 class
class Account{

    //계좌 잔고
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    //출금하는 메소드
    public void withdraw(int money){
            //계좌가 금액보다 커야 출금 가능
        if (balance >= money){
            //예제를 위해 보여주기 위해서 스레드 잠재우기 / 속도가 빨라서
            try {
                //1초 쉬고 빼고 쉬고빼고 함
                /**문제! 두 스레드가 sleep을 잡아서 잔액이 줄다가 마이너스가 됨 스레드가 동시에 들어와서 코드를 변경하기*/
                Thread.sleep(1000);
            }catch (Exception e){
            }
            balance -= money;
        }
    }
}

//객체를 new 해서 만들때 공용객체를 Account로 만듬
class ThreadEx_09 implements Runnable{

    //runnable 구현한 클래스의 객체를 만들면 여러 스레드가 같이 사용한다
    //공용객체
    Account acc = new Account();
    @Override
    public void run() {
                //잔액이 마이너스가 되지 않으면 계속 뽑아냄
        while (acc.getBalance() > 0){
                                        //램덤하게 100, 200, 300 뽑아냄
            int money = ((int)(Math.random()*3 +1) * 100);
                        //10. ~ 4.0 -> 정수로 변경 1~4
            acc.withdraw(money);
            System.out.println("남은 잔액은 : " + acc.getBalance());
        }
    }
}

public class ThreadExam09 {
    public static void main(String[] args) {
        ThreadEx_09 r = new ThreadEx_09(); //runnable 객체
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
