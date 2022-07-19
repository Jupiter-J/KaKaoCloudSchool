package step03;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH]; //하나의 배열 공간을 사용

        //Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNumber = (int) (Math.random() * 3);
            if (randomNumber == 0) {
                shapes[i] = new Rectangle(); //0일경우 사각형
            } else if (randomNumber == 1) {
                shapes[i] = new Ellipse(); //1 일경우
            } else {
                shapes[i] = new Line(); //나머지는 선
            }
        }

        //Drawing Shapes
        for (Shape shape : shapes) {
            //다형성 - 메소드 오버라이딩
            //상위클래스를 ㅊ마조하고 있어도 하위클래스의 메소드가 호출된다
            shape.draw();
        }
    }
}