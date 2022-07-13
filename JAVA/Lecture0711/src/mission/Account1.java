package mission;

public class Account1 {

    private String customer; //예금주
    private String account; //계좌번호
    private int balance; //잔액

    Account1(String customer, String account, int balance){
        this.account =account;
        this.customer = customer;
        this.balance = balance;
    }

    //getter setter 생성
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
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //메서드 생성 : 계좌정보
    public void accountInfo(){
        System.out.println("계좌 " + account + " 예금주:" + customer );
        System.out.println("잔액: " + balance + "원");
    }

    // 입금
    public void deposit(int money){
        System.out.println(money + "원 입금합니다");
        balance += money;
        System.out.println("잔액:" +balance + "원");
    }

    // 출금
    public void withdraw(int money){
        System.out.println(money + "원 출금합니다");
        balance -= money;
        System.out.println("잔액:" +balance + "원");
    }


    public static void main(String[] args) {
        Account1 account = new Account1("홍길동", "123-456789", 10000);
        account.accountInfo();
        account.deposit(2000);
        account.withdraw(45000);
    }

}
