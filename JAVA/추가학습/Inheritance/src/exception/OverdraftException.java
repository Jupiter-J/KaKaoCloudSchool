package exception;

//todo: 내가 정의하고자 하는 예외
public class OverdraftException extends Exception{
    //1. exception 클래스를 상속한다.
    //2. 생성자를 정의한다
    public OverdraftException(String msg) {
        super(msg);
    }
}
