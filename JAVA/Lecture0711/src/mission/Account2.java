package mission;

public class Account2 {

    private String customer;
    private String account;
    private int balance;

    public Account2(String customer, String account, int balance) {
        this.customer = customer;
        this.account = account;
        this.balance = balance;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        System.out.println("잔액: " + balance + "원");
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void Info(){
        System.out.println("계좌: " + account + " 예금주: " +customer);
        getBalance();
    }

    public void deposit(int money){
        System.out.println(money + "원 입금합니다.");
        balance += money;
        getBalance();
    }

    public void withdraw(int money){
        System.out.println(money + "원 출금합니다.");
        balance -= money;
        getBalance();
    }


    public static void main(String[] args) {
        Account2 acc = new Account2("홍길동", "1234-56789", 1000);
        acc.Info();
        acc.deposit(2000);
        acc.withdraw(45000);
    }
}
