package step01;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        //배열 : 참조변수를 여러개 담을 수 있는 변수타입

        //Rectangle 타입의 4 bytes 를 담길 수있는 5개의 방을 만듬
        Rectangle[] rectangles = new Rectangle[5];
        Ellipse[] ellipses = new Ellipse[5];
        Line[] lines = new Line[5];

        //Generate Shapes
        for (int i=0; i<ARRAY_LENGTH; i++){
            int randomNumber = (int)(Math.random() * 3);
            if (randomNumber == 0){
                rectangles[i] = new Rectangle(); //0일경우 사각형
            }else if (randomNumber ==1){
                ellipses[i] = new Ellipse(); //1 일경우
            }else{
                lines[i] = new Line(); //나머지는 선
            }
        }

        //Drawing Shapes
        for (int i=0; i<ARRAY_LENGTH; i++){
            if (rectangles[i] != null){
                rectangles[i].drawRectangle();
            }else if(ellipses[i] != null){
                ellipses[i].drawEllipse();
            }else{
                lines[i].drawLine();
            }
        }

    }
}
