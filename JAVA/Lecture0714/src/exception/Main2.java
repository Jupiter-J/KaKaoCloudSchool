package exception;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작!");
        try {
            Object obj = null;
            System.out.println(obj.toString());
        }catch (ArithmeticException e){
            //exceiption을 처리할꺼라는 코드
            System.out.println("프로그램 오류가 발생했어요!");

        }catch (NullPointerException aa) {

        }finally {
            //오류가 있건 없건간에 무조건 실행된다
        }
        System.out.println("프로그램 종료");
    }
}
