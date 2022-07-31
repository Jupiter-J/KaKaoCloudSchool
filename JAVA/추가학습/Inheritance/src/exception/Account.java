package exception;

public class Account {
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }
                                    //날 호출한 곳으로 예외를 던진다
    public int withdraw(int money) throws OverdraftException {
        if (balance<money){
           throw new OverdraftException("잔액이 부족합니다");
        }
            balance -= money;
        return balance;
    }
}
