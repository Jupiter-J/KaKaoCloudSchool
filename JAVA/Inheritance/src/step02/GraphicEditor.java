package step02;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH]; //하나의 배열 공간을 사용

        //Generate Shapes
        for (int i=0; i<ARRAY_LENGTH; i++){
            int randomNumber = (int)(Math.random() * 3);
            if (randomNumber == 0){
                shapes[i] = new Rectangle(); //0일경우 사각형
            }else if (randomNumber ==1){
                shapes[i] = new Ellipse(); //1 일경우
            }else{
                shapes[i] = new Line(); //나머지는 선
            }
        }

        //Drawing Shapes
        for (Shape shape : shapes){
            //shape 참조하는것은 Rectangle 로 다운캐스팅
            if (shape instanceof Rectangle){
                ((Rectangle)shape).drawRectangle();
//                Rectangle rect = (Rectangle) shape;
//                rect.drawRectangle();
            }else if (shape instanceof Ellipse){
                ((Ellipse)shape).drawEllipse();
            }else if (shape instanceof  Line){
                ((Line)shape).drawLine();
            }
        }

    }
}
