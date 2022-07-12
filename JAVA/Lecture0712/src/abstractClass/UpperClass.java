package abstractClass;

//추상 클래스(abstract class)
public abstract class UpperClass {

    //field
    String name;
    int age;
    //method
    public abstract void printAll(); //abstract method

}

abstract class subClass extends UpperClass{

    //계속 추상 메서드를 사용하기 힘들기 때문에 오버라이딩
    @Override  //쓰는 이유
    public void printAll() {
        
    }
}
