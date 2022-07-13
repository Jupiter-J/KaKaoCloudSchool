package string;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //힙의 stringPool에서 관리됨
        System.out.println(str1 == str3); //힙메모리에 따로 생성
        System.out.println(str1.equals(str3)); //true
        //문장열 내용을 비교할때는 당연히 equals() 사용
        //문자열 내용이 같은지 확인할때 == 사용하지 않는다
    }
}
