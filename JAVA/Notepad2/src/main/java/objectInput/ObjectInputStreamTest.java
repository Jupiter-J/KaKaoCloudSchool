package objectInput;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\readme.txt");

        //파일을 읽어들인다
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            Map<String, String> map = (Map<String, String>)obj;
            System.out.println(map.get("2"));
            ois.close();
            fis.close();
        } catch (Exception e) {

        }
    }
}
