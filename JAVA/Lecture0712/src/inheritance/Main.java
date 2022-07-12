package inheritance;
import java.lang.*;

//상위클래스
class Person extends Object {
    public Person(String name){ //내가만든 생성자
        this.name = name;
    }
 String name; //이름
 String mobile; //전화번호
}
class Student extends Person{
    public Student(){
        super("홍길동"); //명시적으로 형식을 맞춰야한다 -> 아니면 생성못함
    }
  String dept; //학과
}

public class Main{
    public static void main(String[] args) {
        //객체가 만들어지는 순서

//      Person p = new Person();
                    //생성자를 호출하면서 객체를 만들고 -> 생성자의 연속호출이 된다
        Student s = new Student();
        //서브클래스는 슈퍼클래스와 같다
        //Person s = new Student();

    }
}
