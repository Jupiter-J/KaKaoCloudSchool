package mission.mission1;


class Human{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Human() {
    }

    public Human(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String printInformation(){
       return getName()+"\t"+getAge()+"\t"+getHeight()+"\t"+getWeight();
    }




}

class Student extends Human{
    private String number;
    private String major;

    Student(){
    }

    public Student(String name, int age, int height, int weight, String number, String major) {
        super(name, age, height, weight);
        this.number = number;
        this.major = major;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String printInformation() {
        return super.printInformation()+"\t"+getNumber()+"\t"+getMajor();
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student arrays[] = new Student[3];
        arrays[0] = new Student("홍길동", 15,171, 81,"201101","영문");
        arrays[1] = new Student("한사람", 15,171, 81,"201101","영문");
        arrays[2] = new Student("임걱정", 15,171, 81,"201101","영문");


        for (Student x: arrays){
            System.out.println(x.printInformation());
        }
    }
}
