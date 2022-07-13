package stringOveride;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동",20);
        Student s2 = new Student("홍길동",20);

  //      System.out.println(s1); //객체를 문자열로 뽑고싶을때 -> string.Student@58ceff1
  //      System.out.println(s1.toString()); //원래자동적으로 toString이 붙는다 ->string.Student@58ceff1

        //객체가 가진 내용을 내가 원하는 형태로 받고 싶을때
        System.out.println(s1); //Student{name='홍길동', age=20}
    }
}
