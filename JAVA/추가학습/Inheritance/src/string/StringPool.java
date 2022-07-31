package string;

public class StringPool {
    public static void main(String[] args) {
        //빵법1
        String str1 = "Java Programming";
        //방법2
        String str2 = new String("Java Programming");
        //방법 1-1
        String str3 = "Java Programming";

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //true







    }
}
