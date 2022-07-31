package practice2.util;

import java.util.Scanner;

//todo: 사용자로부터 입력받는 로직을 모은다
public class ConsoleUtil {

    private Scanner scanner;

    public ConsoleUtil() {
        this.scanner = new Scanner(System.in);
    }


    //안내문구를 받아서 출력하도록 한다
    public String getValueOf(String label){
        System.out.print(label + ": ");
        String inputStr = scanner.nextLine();
        inputStr = inputStr.trim(); //stream class - 공백을 생략해준다
        return inputStr;
    }


}
