package class0711;

public class Student {
    /** filed 변수들 **/
    // instance variable => 인스턴스내에 공간이 생성
    String stuName; //String -> class -> reference type -> 문자열
    String stuNum; //학번 - 연산을 하지 않는 숫자는 문자열 처리가 좋다
    // class variable => method area안에 class정보안에 공간이 생성, class에 대한 정보가 method area에 생성
    //                  모든 인스턴스에 의해서 공유되는 field
    static String univName;

    /** 생성자들*/
    //인스턴스를 초기화해주는 역할
    //default constructor
    Student(){
    }

    /** 메서드 methods(함수들)*/
    public String getName(){  //instance method
        return this.stuName;
    }

    public static String getUnivName(){ //class method
        return univName;
    }


    public static void main(String[] args) {
        Student stu = new Student(); //인스턴스 생성
        // (.)연산자 Operator
        stu.stuName = "홍길동"; //""문자열 ''문자
        stu.univName = "한국대학교";
        Student.univName = "미국대학교";
        stu.getName();
        stu.getUnivName();
        Student.getUnivName();
    }
}
