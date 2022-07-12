package methodOverriding;

//상위클래스
class Person extends Object {
    String name; //이름
    String mobile; //전화번호
    public void printAll(){
        System.out.println("모두 출력!!");
    }
}
class Student extends Person{
     String dept; //학과
    public void printAll(){
        System.out.println("오버라딩!!");
    }
}

public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.printAll();

    }
}
