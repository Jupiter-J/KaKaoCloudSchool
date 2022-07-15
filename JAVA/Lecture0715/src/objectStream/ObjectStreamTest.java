package objectStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStreamTest {
    public static void main(String[] args) {
        //key value 전부 string
        Map<String, String> map =
                new HashMap<String,String>();

        //스트림형태로 자바 객체가 오고갈 수 있다
        map.put("1","홍길동");
        map.put("2","아이유");
        map.put("3","김연아");

        File file = new File("C:\\Users\\user\\Desktop\\readme.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //객체 자체를 파일에 쓴다
            oos.writeObject(map);
            oos.close(); //가장 마지막에 연것을 먼저 닫는다
            fos.close();

        }catch (Exception e){

        }
    }
}
