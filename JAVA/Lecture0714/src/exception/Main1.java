package exception;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작!");
        try { //예외가 생길 여지가 있는 구문을 넣어준다
            int result = 10/0;
                    //오류가생긴 타입 //e- 객체
        }catch (ArithmeticException e){//catch- 어떤 오류를 잡을 것인지 넣어준다
            //오류 처리코드
            System.out.println("오류가 발생했어요!");
        }
        System.out.println("프로그램 종료");
    }
}
