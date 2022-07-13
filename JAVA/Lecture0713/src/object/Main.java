package object;

//보이지는 않지만 Object를 상속하고 있다
class Student extends Object{
    private String name;
    private int age;

    //default 생성자
    public Student() {
    }

    //인스턴스를 만들기 위한 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //오버라이딩 (상위Object의 메서드를 재정의하여 사용)
    @Override      //is-a 관계로 인해 하위클래스는 상위클래스의 타입을 사용가능하다
    public boolean equals(Object obj) {

        //상위는 하위의 Student 타입이 없음으로 다운캐스팅을 한다
        //Object 타입의 obj를 Student 타입으로 변경
        Student tmp = (Student) obj;
        boolean result = false; //원래는 false 지만 조건후 변경
        if (this.name == tmp.name && this.age == tmp.age){
            result = true;
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동",20);
        Student s2 = new Student("홍길동",20);

        System.out.println(s1 == s2); //메모리 주소가 같은지 - false
 //       System.out.println(s1.equals(s2)); //false Object를 써도 주솟값 비교를 한다

        //하지만 재정의 오버라딩 Oberiding을 하면 커스텀 가능
        System.out.println(s1.equals(s2));
    }
}
