package interfaceCalss;

interface  MyInterface{

}
//하나의 클래스가 있고 하나의 인터페이스가 있을때 어떻게 구현할것인가
class Human{

}


//부모클래스와 같은 개념으로 사용
interface Animal{

    public static final int age = 20; //원래는 이 형태이다
    int weight = 10;

    public abstract void printName(); //인터페이스 안에는 무조건 추상메소드임으로 abstract 이 생략됨
    public void printAge();
}

//앞에가 인터페이스이면 뒤에도 인터페이스여야한다
//상속은 같은 종류에서 일어나야함 (클래스와 인터페이스 관계는 구현이라는 키워드를 사용)
class MyClass extends Human implements Animal, MyInterface{
    //Human 클래스를 상속하는것이고 Animal를 구현하는 것이다

    @Override
    public void printName() {

    }

    @Override
    public void printAge() {

    }


}
public class Main {
}
