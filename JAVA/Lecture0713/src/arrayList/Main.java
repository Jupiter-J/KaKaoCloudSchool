package arrayList;

import java.util.ArrayList;
import java.util.List;

class Student{

}
public class Main {
    public static void main(String[] args) {
        //Arraylist는 배열과 비슷하다다
        //저장은 무조건 객체형태로 해야한다
        List list = new ArrayList<>();
        list.add("Hello");
        list.add("홍길동");
        list.add(100); //다른 타입이 들어가도 된다 = 저장된것 처럼 보임 -> collection은 객체밖 못 넣는다
        //list.add(new Integer(100)); 자동적으로 객체화가 됨됨

        list.add(new Student()); //객체이기만 하면 다 집어넣을 수 있다

        //List를 만들어서 사용할거다
        //같은 데이터타입을 이용하는 경우가 사실 대부분이다
        List<String>list1 = new ArrayList<String>();  //arrayList안에 String만 들어오겠다
            //상위타입도 지정
        list1.add("홍길동");
      //  list1.add(100); //에러
    }

}