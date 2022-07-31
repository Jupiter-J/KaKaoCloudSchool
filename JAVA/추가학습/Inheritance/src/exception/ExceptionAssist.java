package exception;

public class ExceptionAssist {
    public static void main(String[] args) throws OverdraftException {
        Account myAccount = new Account(10000);
        System.out.println(myAccount.withdraw(9000));
        System.out.println(myAccount.withdraw(5000));
    }
}
