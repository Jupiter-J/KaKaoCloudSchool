package Mission.Mission4;

abstract class Shape{
    protected Point point;
    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public abstract double getArea();
        //도형의 넓이
    public abstract double getCircumference();
    //도형의 넓이

    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
}

interface Movable {
    public void move(int x, int y);
}

class Circle extends Shape implements Movable{
 private int radius;

    Circle(){
    }

    public Circle(Point point, int radius) {
        super(new Point(point.getX(), point.getY()));
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        //원의 둘레를 리턴
        double a= point.getX()*3.14;
        String.format("%.1f",a);
        radius = (int) a;
        return radius;
    }

    @Override
    public void move(int x, int y) {
        //도형의 좌표를 변경
    }

    @Override
    public double getArea() {
        //도형의 넓이를 리턴
        return 0;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape implements Movable{
    private int width;

    Rectangle(){

    }

    public Rectangle(Point point, int width) {
        super(point);
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        x = y+2;

    }

    @Override
    public double getArea() {
        return 0;
    }

}

class Point{
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class ShapeTest {
    public static void main(String[] args) {

    }
}
