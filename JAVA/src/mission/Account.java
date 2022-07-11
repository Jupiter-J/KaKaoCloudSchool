package mission;

import java.util.Scanner;

public class Account {

    private String customer; //예금주
    private String account; //계좌번호
    private int cost; //잔액
    private int money;

    public Account(){
        this.customer = "홍길동";
        this.account= "123-456789";
        this.cost = 10000;
    }

    public String deposit( int cost, int money){ //입금;
        this.cost = cost;
        this.money = money;
        int result = cost + money;
        return money+"원 입금합니다. /n + 잔액: " + result ;
    }

    public String withdraw(int cost, int money){ //출금
        this.cost = cost;
        this.money = money;
        int result = cost - money;
        return  money+"원 출금합니다. /n + 잔액: " + result ;
    }


    public static void main(String[] args) {


    }

}
