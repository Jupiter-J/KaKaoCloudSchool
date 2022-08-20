import java.util.ArrayList;
import java.util.List;

public class LambdaTypeExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("React");

        for (String str : list){
            System.out.println(str);
        }
        System.out.println();

        // 1. forEach                ()파라미터 -> {}실행문 : 한줄이면 {}생략가능
        list.stream().forEach((String str)-> System.out.println(str));

        // 2. forEach                ()파라미터 타입과 list(배열)타입이 같으면 () 생략가능, 파라미터가 2개이상이면 ()사용
        list.stream().forEach(str-> System.out.println(str));

        // 3. forEach                함수 레퍼런스
        list.stream().forEach(System.out::println);

    }
}
