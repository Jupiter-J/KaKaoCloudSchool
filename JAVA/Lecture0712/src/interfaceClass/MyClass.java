package interfaceClass;

interface myInterface {
    //fields
    //public  static final
    int kk = 0;
    String aa = "Hello";

    //method
    public abstract void printAll();
    public abstract void myPrint();

}

public class MyClass implements myInterface{

    @Override
    public void printAll() {

    }

    @Override
    public void myPrint() {

    }
}
